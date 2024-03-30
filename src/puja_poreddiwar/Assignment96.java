/*
 * Assignment - 96 : 25th March'2024 [45-50 mins] 
1. Print Fibonacci series for n elements.
input : 10
output : 0,1,1,2,3,5,8,13,21,34

2. Print all the numbers of Fibonacci series where in series number should not cross 100.
input : 100
output : 0,1,1,2,3,5,8,13,21,34,55,89 

3 Return all the numbers of Fibonacci series between 50 to 100.
output : 55,89 
 */
package puja_poreddiwar;

public class Assignment96 {

	//------------------Assignment 96.1-----------------
	void printFibonacciSeries(int n) {
		int temp = 0;
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 2; i < n; i++) {
			temp = num1 + num2;
			System.out.println(temp);
			num1 = num2;
			num2 = temp;
		}
	}

	//------------------Assignment 96.2-----------------
	void printFibonacciTill100(int n) {
		int temp = 0;
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		while ((num1 + num2) < n) {
			temp = num1 + num2;
			System.out.println(temp + " ");
			num1 = num2;
			num2 = temp;
		}
	}

	//------------------Assignment 96.3-----------------
	void printFibonacci50To100(int startRange, int endRange) {
		int temp = 0;
		int num1 = 0;
		int num2 = 1;
		while ((num1 + num2) < endRange) {
			temp = num1 + num2;
			if (temp > startRange) {
				System.out.println(temp + " ");
			}
			num1 = num2;
			num2 = temp;
		}
	}

	public static void main(String[] args) {
		Assignment96 finonacciSeries = new Assignment96();
		System.out.println("============ A - 96.1 ===============");
		finonacciSeries.printFibonacciSeries(10);
		
		System.out.println("============ A - 96.2 ===============");
		finonacciSeries.printFibonacciTill100(100);
		
		System.out.println("============ A - 96.3 ===============");
		finonacciSeries.printFibonacci50To100(50, 100);
	}

}
