package ashwini_b;

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
public class Asgnmt96_FibonacciSeries {

	void printNum(int range) {
		System.out.println("Print Fibonacci series for " + range + " elements");
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.print(num1 + "," + num2);
		for (int index = 3; index <= range; index++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print("," + sum);
		}
		System.out.println("");
	}

	void print100Num(int range) {
		System.out
				.println("Print all the numbers of Fibonacci series where in series number should not cross " + range);
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.print(num1 + "," + num2);

		for (; sum <= range;) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			if (sum <= range) {
				System.out.print("," + sum);
			}
		}
		System.out.println("");
	}

	void printNumrFrom50to100(int range1, int range2) {
		System.out.println("Return all the numbers of Fibonacci series between 50 to 100");
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		// System.out.print(num1 + "," + num2);
		for (; sum <= range2;) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			if (sum <= range2 && sum >= range1) {
				System.out.print(sum + "," );
			}
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Asgnmt96_FibonacciSeries asgnmt96_FibonacciSeries = new Asgnmt96_FibonacciSeries();
		asgnmt96_FibonacciSeries.printNum(10);
		asgnmt96_FibonacciSeries.print100Num(100);
		asgnmt96_FibonacciSeries.printNumrFrom50to100(50, 100);
	}
}
