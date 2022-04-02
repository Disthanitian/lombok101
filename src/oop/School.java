package oop;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@SuperBuilder()
@Valid
public class School extends Building {

    @Getter
    @Setter(onMethod_ = {@Max(10), @NotNull})
    private String name;

    @Getter
    @Setter
    private String address;

}
