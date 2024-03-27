/*
Assignment - 96 : 25th March'2024 [45-50 mins] 
1. Print Fibonacci series for n elements.
input : 10
output : 0,1,1,2,3,5,8,13,21,34

2. Print all the numbers of Fibonacci series where in series number should not cross 100.
input : 100
output : 0,1,1,2,3,5,8,13,21,34,55,89 

3 Return all the numbers of Fibonacci series between 50 to 100.
output : 55,89
 */

package phenol_verma;

public class FibonacciSeries {

	void fibonacciSeriesTillNth1(int n) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for (int index = 0; index < n - 2; index++) {
			int nextNum = num1 + num2;
			num1 = num2;
			num2 = nextNum;
			System.out.print(nextNum + " ");
		}
	}

	void fibonacciSeriesNotCross100(int n) {
		int num1 = 0;
		int num2 = 1;
		int nextNum = 0;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		while (nextNum < n) {
			nextNum = num1 + num2;
			num1 = num2;
			num2 = nextNum;
			if (nextNum > n) {
				break;
			}
			System.out.print(nextNum + " ");
		}
	}

	void fibonacciSeriesBetween50To100(int startNum, int endNum) {
		int num1 = 0;
		int num2 = 1;
		int nextNum = 0;
		if (startNum < 1) {
			System.out.print(num1 + " ");
			System.out.print(num2 + " ");
		}
		while (nextNum < endNum) {
			nextNum = num1 + num2;
			num1 = num2;
			num2 = nextNum;
			if (nextNum > startNum && nextNum < endNum) {
				System.out.print(nextNum + " ");
			}
		}
	}

	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		System.out.println("1. Print Fibonacci series for n elements");
		fibonacciSeries.fibonacciSeriesTillNth1(10);
		System.out.println();

		System.out.println("*******************************************");
		System.out.println("2. Print all the numbers of Fibonacci series where in series number should not cross 100");
		fibonacciSeries.fibonacciSeriesNotCross100(100);
		System.out.println();

		System.out.println("*******************************************");
		System.out.println("3. Return all the numbers of Fibonacci series between 50 to 100");
		fibonacciSeries.fibonacciSeriesBetween50To100(50, 100);
	}
}
