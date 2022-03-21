package oop;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(prefix = "o")
public class OldProduct {

    private String oProductName;
    private String oCategoryName;
    private double oPrice;
    private int oQuantity;

}
