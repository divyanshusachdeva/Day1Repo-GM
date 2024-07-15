package com.graymatter;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Table of " + num);
		for(int i = 1 ; i <= 10; i++)
		{
			System.out.println(num + " x " + i + " = " + (num*i));
		}
	
	}

}
