package services;

import oop.School;

public class SchoolService {

    public static void main(String[] args){

        School school = School.builder()
                .name("Trim Udom")
                .address("BKK")
                .type("SC1")
                .build();

        System.out.println(school);

    }

}
