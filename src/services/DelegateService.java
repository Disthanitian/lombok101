package services;

import utility.DelegateList;

public class DelegateService {

    public static void main(String[] args){

        DelegateList<String> stringList = new DelegateList<>();
        stringList.add("Hi");
        stringList.add("Hello");
        stringList.remove("Hi");

        stringList.stream().forEach(System.out::println);
    }

}
