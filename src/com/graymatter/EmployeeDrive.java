package com.graymatter;

public class EmployeeDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Employee emp = new Employee(); //object
			//new Employee() - JVM invokes a default constructor
			//constructor is a special method used to create object space at runtime on heap memory
			//a constructor is always public
			
			
//			emp.setDetails();
			emp.getDetails();
			
			Employee emp1 = new Employee("Amit", 112, 7000, "1212121212", "asd@gmail.com");
			
			emp1.getDetails();
	}

}
