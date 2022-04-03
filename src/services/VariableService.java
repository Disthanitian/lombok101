package services;

import lombok.val;

import java.util.ArrayList;
import java.util.List;

public class VariableService {

    public static void main(String[] args){

        List<String> testStrList = new ArrayList<>();
        testStrList.add("Hello");

        val testStrListVal = new ArrayList<>();
        testStrListVal.add("HI");
        testStrListVal.stream().forEach(System.out::println);

        val str = "Hello WOrld";
        System.out.print(str);

    }

}
