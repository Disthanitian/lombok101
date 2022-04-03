package oop;

import lombok.Data;
import lombok.NonNull;

@Data
public class City {

    @NonNull
    private String name;
    private String code;

}
