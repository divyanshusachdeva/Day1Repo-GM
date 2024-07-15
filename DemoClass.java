package com.graymatter;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num = 5;
			System.out.println("The number is: "+ num);
			boolean flag = false;
			System.out.println(flag);
			
			int num1 = 8, num2 = 3;
			System.out.println("Sum is: "+ (num1 + num2));
			System.out.println("Difference is: "+ (num1 - num2));
			System.out.println("Quotient is: "+ (num1 / num2));
			System.out.println("Remainder is: "+ (num1 % num2));
			System.out.println("Product is: "+ (num1 * num2));
			System.out.println("Quotient is: "+ ((float)num1 / num2)); //Did typecasting here for decimal
	
	
			int a = 78, b = 55, c = 66;
			
			int d = a > b ? (a > c ? a : c) : (b > c ? b : c); //Logic 1
			int max = (a > b && a > c) ? a : (b > c ? b : c); //Logic 2
			System.out.println(max);
			
			//ASSIGNMENT: Maximum of 4 numbers and 5 numbers using ternary operator (question 1 and 2)
			
			
			
			//Swapping 2 numbers without using temporary variable:
			
//			a = a + b;
//			b = a - b;
//			a = a - b;
			
			//Swapping 3 numbers without using temporary variable:
			
			a = a + b + c;
			b = a - b - c;
			c = a - b - c;
			a = a - b - c;
			
			//Check if a number is even or odd using ternary operator
			
			System.out.println(a % 2 == 0 ? "Even" : "Odd");
			
			//ASSIGNMENT: Swapping 4 numbers and 5 numbers without using temporary variable (question 3)
			
			
			// BITWISE OPERATORS
			
			int y = 5, z = 3;
			System.out.println("Bitwise AND: " + (y&z)); // Bitwise AND
			System.out.println("Bitwise OR: " +(y|z)); // Bitwise OR
			
			int num3 = -60;
			System.out.println("Right shift by 3: " + (num3>>3)); //Right shift
			
			System.out.println("XOR Operator: " + (y^z)); //XOR Operator
			
			
			// TYPECASTING
			
			int j = 6;
			float f = j;  //Widening- lower range datatype to higher range datatype - Explicit Typecasting
			
			float f1 = 5.6f;
			int i = (int)f1; //Narrowing- Some times, there might be a data loss - Implicit Typecasting
	
	
	
	}

}
