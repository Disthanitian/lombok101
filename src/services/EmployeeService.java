package services;

import oop.Employee;

import java.time.LocalDate;

public class EmployeeService {

    public static void main(String[] args){
        Employee employee = Employee.of(1L, "ABC1");

        System.out.println(employee);
    }

}
