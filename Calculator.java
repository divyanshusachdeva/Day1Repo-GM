package com.graymatter;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		
		int a, b, operation;
		
		System.out.println("Enter 2 numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Enter the operator: ");
		operation = sc.next().charAt(0); // It reads 1 chracter
		
		if (operation =='+')
			System.out.println(a+b);
		else if (operation =='-')
			System.out.println(a-b);
		else if (operation =='*')
			System.out.println(a*b);
		else if (operation =='/')
			System.out.println((float)a/b);
		else
			System.out.println("The operator entered is invalid!");
		
		
	
	}

}
