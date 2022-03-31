package utility;

import lombok.experimental.UtilityClass;

@UtilityClass
public class NameUtility {

    public String buildFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public String buildFullName(String firstName,String middleName, String lastName){
        return firstName + " "+ middleName + " " + lastName;
    }

}
