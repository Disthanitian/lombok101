package services;

import lombok.NonNull;
import oop.City;

public class CityService {

    public static void main(String[] args){

        @NonNull City city = new City("a");
        city.setCode("ABC");
        //city.setName(null);

        System.out.println(city);

        System.out.println(getSummary(null));

    }

    public static String getSummary(@NonNull String arg){
        if(arg == null){

        }
        return arg;
    }

}
