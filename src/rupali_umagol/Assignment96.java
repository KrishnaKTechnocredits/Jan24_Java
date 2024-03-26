/*1. Print Fibonacci series for n elements.
input : 10
output : 0,1,1,2,3,5,8,13,21,34

2. Print all the numbers of Fibonacci series where in series number should not cross 100.
input : 100
output : 0,1,1,2,3,5,8,13,21,34,55,89 

3 Return all the numbers of Fibonacci series between 50 to 100.
output : 55,89 */
package rupali_umagol;

public class Assignment96 {
	void getFacbonnacci(int num) {
		System.out.println("Fabonnacci Series :");
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.print(num1 + " " + num2 + " ");
		for (int i = 3; i <= num; i++) {
			sum = num1 + num2;
			System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
		}
	}

	void getFacbonnacciRangeLessThan100() {
		System.out.println("Fabonnacci Series :");
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.print(num1 + " " + num2 + " ");
		while (sum < 100) {
			sum = num1 + num2;
			if (sum < 100)
				System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
		}
	}

	void getFacbonnacciRangeBetween50To100(int lowerRange, int UpperRange) {
		System.out.println("Fabonnacci Series :");
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		while (sum < UpperRange) {
			sum = num1 + num2;
			if (sum > lowerRange && sum < UpperRange)
				System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
		}
	}

	public static void main(String[] args) {
		Assignment96 assignment = new Assignment96();
		assignment.getFacbonnacci(10);
		System.out.println();
		assignment.getFacbonnacciRangeLessThan100();
		System.out.println();
		assignment.getFacbonnacciRangeBetween50To100(50, 100);
	}
}
