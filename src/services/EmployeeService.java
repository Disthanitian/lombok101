package services;

import oop.Employee;

public class EmployeeService {

    public static void main(String[] args){
        Employee employee = new Employee();
        employee.setNationalId("12222222222222");
        employee.setId(1L);
        employee.setFirstName("John");
        employee.setLastName("Wick");
        employee.setGender("Male");

        Employee employee1 = new Employee();
        employee1.setNationalId("122222222222223");
        employee1.setId(1L);
        employee1.setFirstName("John");
        employee1.setLastName("Wick");
        employee1.setGender("Male");

        System.out.println(employee.equals(employee1));
    }

}
