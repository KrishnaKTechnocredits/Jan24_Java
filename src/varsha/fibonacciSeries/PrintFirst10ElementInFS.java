package varsha.fibonacciSeries;

import java.util.Scanner;

//1. Print Fibonacci series for n elements.
//input : 10
//output : 0,1,1,2,3,5,8,13,21,34

public class PrintFirst10ElementInFS {

	void PrintFirstTenElementOfSeries(int element) {
		int num1 = 0, num2 = 1;
		int sum = 0;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 2; i < element; i++) {
			sum = num1 + num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the Element : ");
		int element = sc.nextInt();
		sc.close();
		new PrintFirst10ElementInFS().PrintFirstTenElementOfSeries(element);
	}
}
