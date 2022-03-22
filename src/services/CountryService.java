package services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import oop.Country;

import java.io.IOException;

public class CountryService {

    public static void main(String[] args) throws IOException {

        Country country = Country.builder()
                .name("Thailand")
                .latitude("111")
                .longitude("222")
                .build();

        ObjectMapper objectMapper = new ObjectMapper();
        String result = objectMapper.writeValueAsString(country);
        System.out.println(result);

        Country deCountry = objectMapper.readValue(result, Country.class);
        System.out.println(deCountry);

    }

}
