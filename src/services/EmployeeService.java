package services;

import oop.Employee;

public class EmployeeService {

    public static void main(String[] args){
        Employee employee = Employee.of(1L,"ABC001" );
        employee.setNationalId("12222222222222");
        employee.setFirstName("John");
        employee.setLastName("Wick");
        employee.setGender("Male");

        Employee employee1 = Employee.of(1L,"ABC001");
        employee1.setNationalId("12222222222222");
        employee1.setFirstName("John");
        employee1.setLastName("Wick");
        employee1.setGender("Male");

        System.out.println(employee);
        System.out.println(employee.equals(employee1));
    }

}
