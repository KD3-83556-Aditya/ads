package com.sunbeam;

import java.util.Scanner;

public class Employee {
    private int empid;
    private String name;
    private int salary;

    public Employee() {

    }

    public Employee(int empid, String name, int salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
    }

    public void acceptData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Emp id");
        empid = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter salary");
        salary = sc.nextInt();
    }

    public void displayData() {
        System.out.println("Employee Id: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
