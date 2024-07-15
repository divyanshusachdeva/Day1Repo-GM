package com.graymatter;

import java.util.Scanner;

//class name is Employee
//POJO class - Plain Old Java Object - If you don't have a main method
//If there is a main method: Driver class

public class Employee {
	
	//Properties or instance variables (object-related variables)
	String name;
	int id;
	double salary;
	String mobile;
	String email;
	
	//default constructor
	public Employee() {
		System.out.println("From my default constructor");
	}
	
	
//	static String companyName;
	
	
// alt + shift + s will generate a constructor. otherwise, it can be generated from the source as well (Beside edit)	
	public Employee(String name, int id, double salary, String mobile, String email) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.mobile = mobile;
		this.email = email;
	}




	public void setDetails() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter employee details");
		System.out.println("Enter employee name: ");
		this.name = sc.next();
			
		System.out.println("Enter employee ID: ");
		this.id = sc.nextInt();
		
		System.out.println("Enter employee Salary: ");
		this.salary = sc.nextDouble();
				
		System.out.println("Enter employee Mobile number: ");
		this.mobile = sc.next();
				
		System.out.println("Enter employee email ID: ");
		this.email = sc.next();
		
	}
	
	public void getDetails() {
		System.out.println("Employee name: " + this.name);
		System.out.println("Employee ID: " + this.id);
		System.out.println("Employee Salary: " + this.salary);
		System.out.println("Employee Mobile number: " + this.mobile);
		System.out.println("Employee email ID: " + this.email);

	}

}
