package oop;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Objects;

@ToString(exclude = {"id", "empCode"}, callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Employee extends Person {

    @Getter
    @Setter
    private Long id;

    @Getter()
    @Setter()
    private String empCode;

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private LocalDate birthDate;

    @Getter
    @Setter
    private String gender;

}
