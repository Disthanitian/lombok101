package oop;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

import java.time.LocalDate;

@Data(staticConstructor = "of")
@EqualsAndHashCode(callSuper = true)
public class Employee extends Person {

    private final Long id;
    private final String empCode;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;

}
