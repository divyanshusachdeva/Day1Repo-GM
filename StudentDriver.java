package com.graymatter;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st1 = new Student();
		//System.out.println(st1);
		
		st1.setStudName("Divyanshu");
		st1.setId(253);
		st1.setM1(98);
		st1.setM2(99);
		st1.setM3(94);
		
//		System.out.println(st1); // using toString()
		
//		System.out.println("Using getters: ");
		
		System.out.println("STUDENT REPORT");
		System.out.println("Student Name: " + st1.getStudName());
		System.out.println("Student ID: " + st1.getId());
		System.out.println("Marks in subject 1: " + st1.getM1());
		System.out.println("Marks in subject 2: " + st1.getM2());
		System.out.println("Marks in subject 3: " + st1.getM3());
		
		int avg = st1.getM1()+st1.getM2()+st1.getM3()/3;
		
		System.out.println("The average marks is: " + avg);
		
		if (avg >= 75)
			System.out.println("The student has scored First Class with Distinction");
		else if (avg >= 65 && avg < 75)
			System.out.println("The student has scored First Class");
		else if (avg >= 55 && avg < 65)
			System.out.println("The student has scored Second Class");
		else if (avg >= 40 && avg < 55)
			System.out.println("The student has scored Third Class");
		else if (avg < 40)
			System.out.println("The student has Failed");
		
		
		
		
		
//		Student st2 = new Student("Divyanshu", 125, 98, 97, 96);
//		System.out.println(st2);
//		
//		Student st3 = new Student("Hello", 435);
//		System.out.println(st3);
		
	}

}