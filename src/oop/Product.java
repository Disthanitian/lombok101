package oop;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true, chain = true)
public class Product {

    private String name;
    private String category;
    private double price;
    private int quantity;

}
