package services;

import exceptions.MyCustomException;
import lombok.SneakyThrows;

public class CustomExceptionService {

    @SneakyThrows
    public static void main(String[] args){
        throw new MyCustomException("This is my message");

    }

}
