/*Assignment - 96 : 25th March'2024 [45-50 mins] 
1. Print Fibonacci series for n elements.
input : 10
output : 0,1,1,2,3,5,8,13,21,34

2. Print all the numbers of Fibonacci series where in series number should not cross 100.
input : 100
output : 0,1,1,2,3,5,8,13,21,34,55,89 

3 Return all the numbers of Fibonacci series between 50 to 100.
output : 55,89 */
package madhura_kulkarni;

import java.util.Scanner;

public class Assignment96 {
	void fibonacciSeriesForTenNumbers(int n) {
		int n1 = 0, n2 = 1, n3 = 0, index = 2;
		System.out.println(n1);
		System.out.println(n2);
		while (index < n) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
			index++;
		}
	}

	void fibonacciSeriesTillNum(int n) {
		int n1 = 0, n2 = 1, n3 = 0, index = 2;
		System.out.println(n1);
		System.out.println(n2);
		while (index < 100) {
			n3 = n1 + n2;
			if (n3 < 100)
				System.out.println(n3);
			else
				break;
			n1 = n2;
			n2 = n3;
			index++;
		}
	}

	void fibonacciSeriesBetweenTwoNum(int num1, int num2) {
		int n1 = 0, n2 = 1, n3 = 0;
		for (int index = 2; index < 100; index++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			if (n3 > num1 && n3 < num2)
				System.out.println(n3);
		}
	}

	public static void main(String[] args) {
		Assignment96 ass96 = new Assignment96();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		ass96.fibonacciSeriesForTenNumbers(n);
		System.out.println("Enter a number upto which the Fibonacci series to be printed:");
		int num = sc.nextInt();
		ass96.fibonacciSeriesTillNum(num);
		System.out.println("Enter two numbers between which the Fibonacci series to be printed:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		ass96.fibonacciSeriesBetweenTwoNum(n1, n2);
		sc.close();
	}

}
