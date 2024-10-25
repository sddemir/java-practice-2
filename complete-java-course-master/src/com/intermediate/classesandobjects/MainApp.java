package com.intermediate.classesandobjects;

public class MainApp {
    public static void main(String[] args) {
        EmployeesApp emp1 = new EmployeesApp("Albert Einstein", "Scientist", 32.65);
        EmployeesApp emp2 = new EmployeesApp("Epiktetos", "Slave", 0.01);
        emp1.printEmployeeDetails();
        emp2.printEmployeeDetails();

        emp1.salaryRaise(50);
        emp2.salaryRaise(50);
        System.out.println("After raising salary:");
        emp1.printEmployeeDetails();
        emp2.printEmployeeDetails();
        System.out.println(emp1.getName());

    }
}
