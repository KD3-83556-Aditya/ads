package com.sunbeam;

import java.util.Scanner;

public class SortEmployees {
	private int empno;
	private String name;
	private int salary;
	
	public SortEmployees() {
		
	}
	public SortEmployees(int empno, String name, int salary) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
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
		return "SortEmployees [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public void acceptEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee number");
		int empno = sc.nextInt();
		System.out.println("Enter employee name");
		String name = sc.next();
		System.out.println("Enter employee salary");
		int salary = sc.nextInt();
	}
	
	public void displayEmployee() {
		System.out.println("Employee no: "+empno);
		System.out.println("Employee name: "+name);
		System.out.println("Employee salary: "+salary);

	}
	
	
	

}
