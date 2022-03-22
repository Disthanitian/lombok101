package oop;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class Country {

    private String name;
    private String latitude;
    private String longitude;

    @Tolerate
    private void setLatitude(Double latitude){
        this.latitude = String.valueOf(latitude);
    }

}
