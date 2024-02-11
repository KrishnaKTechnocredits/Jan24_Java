/*
 * Assignment - 1 : 15th Jan'2024

Write a Calculator program having 4 method to perform addition, subtraction, multiplication and division with 2 instance variables

output should be: 
num1 is 20, num2 is 30, addition = 50
num1 is 50, num2 is 22, subtraction = 28
num1 is 200, num2 is 10, division = 20
num1 is 50, num2 is 5, multiplication = 250*/
package sarang_kulkarni;

public class Calculator {
	void addition(int num1,int num2) {
		//int sum=0;
		System.out.println("nun1 is "+num1 +" num2 is "+num2 +",Addition ="+(num1+num2));
		
	}
	void substraction(int num1,int num2) {
		int sub=num1-num2;
		System.out.println("nun1 is "+num1 +" num2 is "+num2 +",Substraction ="+sub);
	}
	void multiplication(int num1,int num2) {
		System.out.println("nun1 is "+num1 +" num2 is "+num2 +",Multiplication ="+num1*num2);
	}
	void division(int num1,int num2) {
		System.out.println("nun1 is "+num1 +" num2 is "+num2 +",Division ="+num1/num2);
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.addition(20,30);
		cal.substraction(50,22);
		cal.multiplication(50,5);
		cal.division(200,10);
		
	}

}
