package oop;

import lombok.*;

import java.util.List;

@Data
@Builder(access = AccessLevel.PUBLIC,
        toBuilder = true)
public class Address {

    @NonNull
    private String roomNo;
    private String building;
    private String street;
    private String subDistrict;
    private String district;

    @Builder.Default
    private String province = "Bangkok";
    private String portalCode;

    @Singular(value = "phone")
    private List<String> phones;

}
