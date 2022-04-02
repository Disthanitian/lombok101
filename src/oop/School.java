package oop;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder()
public class School extends Building {

    private String name;
    private String address;

}
