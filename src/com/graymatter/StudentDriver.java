package com.graymatter;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st1 = new Student();
		System.out.println(st1);
		
		st1.setStudName("Divyanshu");
		st1.setId(253);
		st1.setM1(98);
		st1.setM2(99);
		st1.setM3(94);
		
		System.out.println(st1); // using toString()
		
		System.out.println("Using getters: ");
		System.out.println(st1.getStudName());
		System.out.println(st1.getId());
		System.out.println(st1.getM1());
		System.out.println(st1.getM2());
		System.out.println(st1.getM3());
		
		Student st2 = new Student("Divyanshu", 125, 98, 97, 96);
		System.out.println(st2);
		
	}

}
