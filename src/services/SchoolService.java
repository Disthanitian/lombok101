package services;

import oop.School;

import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

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
