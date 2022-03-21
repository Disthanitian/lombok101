package oop;

import lombok.*;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor(staticName = "of")
public class Employee extends Person {

    private final Long id;
    @NonNull private String empCode;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;

}
