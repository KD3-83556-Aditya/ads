package com.sunbeam;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List e1 = new List();

        do {
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Delete Employee by Employee ID");
            System.out.println("5. Update Salary of Employee");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Employee employee = new Employee();
                    employee.acceptData();
                    e1.addFirst(employee); 
                    break;
                case 2:
                    e1.displayAll();
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String name = sc.nextLine();
                    e1.searchEmployeeByName(name);
                    break;
                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int empIdToDelete = sc.nextInt();
                    e1.deleteEmployeeById(empIdToDelete);
                    break;
                case 5:
                    System.out.print("Enter Employee ID to update salary: ");
                    int empIdToUpdate = sc.nextInt();
                    System.out.print("Enter new salary: ");
                    int newSalary = sc.nextInt();
                    e1.updateSalaryById(empIdToUpdate, newSalary);
                    break;
                case 0:
                    System.out.println("Thank You...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice");
            }
        } while (true);
    }
}
