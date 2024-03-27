package varsha.fibonacciSeries;

import java.util.Scanner;

//2. Print all the numbers of Fibonacci series where in series number should not cross 100.
//input : 100
//output : 0,1,1,2,3,5,8,13,21,34,55,89 

public class PrintAllTheNumberTill100InFS {

	void PrintFirstTenElementOfSeries(int element) {
		int num1 = 0, num2 = 1;
		int sum = 0;
		System.out.println(num1);
		System.out.println(num2);
		while (sum < element) {
			sum = num1 + num2;
			if (sum < element) {
				System.out.println(sum);
			}
			num1 = num2;
			num2 = sum;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the Element : ");
		int element = sc.nextInt();
		sc.close();
		new PrintAllTheNumberTill100InFS().PrintFirstTenElementOfSeries(element);
	}
}
