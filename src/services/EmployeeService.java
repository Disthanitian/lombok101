package services;

import oop.Company;
import oop.Employee;

import java.time.LocalDate;

public class EmployeeService {

    public static void main(String[] args){
        Employee employee = Employee.of(1L, "ABC1");
        Company c = new Company("Skillane", "Bangkok");
        System.out.println(employee);
        System.out.println("This is company: " + c);
    }

}
