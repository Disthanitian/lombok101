package services;

import oop.OldProduct;
import oop.Product;

public class ProductService {

    public static void main(String[] args){
        Product product = new Product();
        product.name("ABC").category("COMMODITY").price(200d).quantity(10);

        OldProduct oldProduct = new OldProduct();
        oldProduct.setCategoryName("RETAILER");

        System.out.println(product);
    }


}
