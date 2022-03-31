package services;

import oop.Address;
import oop.Company;
import oop.Employee;
import utility.NameUtility;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    public static void main(String[] args){
        Employee employee = Employee.of(1L, "ABC1");
        Company c = new Company("Skillane", "Bangkok");


        Address address = Address.builder()
                .roomNo("1452")
                .building("Jatujak Tower")
                .subDistrict("Jatujak")
                .district("Jatujak")
                .portalCode("10000")
                .street("Paholyothin Road")
                .phone("089999999")
                .phone("08777777")
                .build();

        Address address1 = address.toBuilder().build();

        //System.out.println(employee);
        //System.out.println("This is company: " + c);
        System.out.println("This is address: " + address);
        System.out.println("This is address: " + address1);


        String fullName = NameUtility.buildFullName("John", "William");
        String fullNameWithNiddleName = NameUtility.buildFullName("John" ,"van", "William");
        System.out.println(fullName);
        System.out.println(fullNameWithNiddleName);
    }

}
