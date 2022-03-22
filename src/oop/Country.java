package oop;

import lombok.Data;
import lombok.experimental.Tolerate;

@Data
public class Country {

    private String name;
    private String latitude;
    private String longitude;

    @Tolerate
    private void setLatitude(Double latitude){
        this.latitude = String.valueOf(latitude);
    }

}
