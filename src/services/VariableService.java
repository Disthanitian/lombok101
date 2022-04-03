package services;

import lombok.val;
import lombok.var;

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
        System.out.println(str);

        var aList = new ArrayList<>();
        aList.add("THis is var");
        aList.stream().forEach(System.out::println);

        var xx = 2;
        System.out.println(xx);
    }

}
