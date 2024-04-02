package shridhar_k;
// 1. Print Fibonacci series for n elements.

// input : 10
// output : 0,1,1,2,3,5,8,13,21,34

// 2. Print all the numbers of Fibonacci series where in series number should not cross 100.
// input : 100
// output : 0,1,1,2,3,5,8,13,21,34,55,89 

// 3 Return all the numbers of Fibonacci series between 50 to 100.
// output : 55,89 
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Assignment96 {

	void printFibonacciNElement(int num) {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + ", " + b + ", ");
		for (int i = 0; i < num; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + ", ");
		}
		System.out.println();
	}

	void printFibonacciForRange(int num1, int num2) {
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 0; i < num2; i++) {
			c = a + b;
			a = b;
			b = c;
			// System.out.print(c + ", ");
			if (c < num2 && c >= num1) {
				System.out.print(c + ", ");
			}
			if (c > num2) {
				break;
			}
		}
		System.out.println();
	}

	void printFibonacciForUpperLimit(int num) {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + ", " + b + ", ");
		while (c < 100) {
			c = a + b;
			a = b;
			b = c;
			if (c < 100)
				System.out.print(c + ", ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Fibonacci series for 10 elements.");
		new Assignment96().printFibonacciNElement(10);
		System.out.println();
		System.out.println("all the numbers of Fibonacci series between 50 & 100");
		new Assignment96().printFibonacciForRange(50, 100);
		System.out.println();
		System.out.println("all the numbers of Fibonacci series up to 100");
		new Assignment96().printFibonacciForUpperLimit(100);
	}
}