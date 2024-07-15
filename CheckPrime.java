package com.graymatter;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int i=2;
		boolean flag = true;
		
		while(i<Math.sqrt(num))
		{
			if(num % i ==0)
			{
				flag = false;
				break;
			}
			
			i++;
		}
		
		if(flag)
			System.out.println("The number is Prime");
		else
			System.out.println("The number is not Prime");
	}
	

}
