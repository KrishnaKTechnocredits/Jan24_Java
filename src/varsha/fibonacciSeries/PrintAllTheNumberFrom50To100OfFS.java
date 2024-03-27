package varsha.fibonacciSeries;

import java.util.Scanner;

//3 Return all the numbers of Fibonacci series between 50 to 100.
//output : 55,89 

public class PrintAllTheNumberFrom50To100OfFS {

	void PrintFirstTenElementOfSeries(int element1, int element2) {
		int num1 = 0, num2 = 1;
		int sum = 0;
		while (sum < element2) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			if (sum > element1 && sum < element2) {
				System.out.println(sum);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the First Element : ");
		int element1 = sc.nextInt();
		System.out.println("please enter the Second Element : ");
		int element2 = sc.nextInt();
		sc.close();
		new PrintAllTheNumberFrom50To100OfFS().PrintFirstTenElementOfSeries(element1, element2);
	}
}
