package com.intermediate.classesandobjects;

public class EmployeesApp {
    String name;
    String jobTitle;
    double salary;
    private int percentage;

    public EmployeesApp(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public String getJob(String jobTitle){
        return jobTitle;
    }
    public double getSalary(){
        return salary;
    }
    public void salaryRaise(double percentage){
        salary = salary + salary * percentage / 100;
    }
    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}
