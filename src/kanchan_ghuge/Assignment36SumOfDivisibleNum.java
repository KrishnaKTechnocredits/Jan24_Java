package kanchan_ghuge;

/*Assignment - 36 : 4th Feb'2024

Return the sum of all the numbers which are divisible by 3 or 5.

input : {6, 5, 3, 15, 19, 40, 30, 27, 11}
Output : 126

Div by 3 : 6+3+27+15+30 = 81
Div by 5 : 5+15+30+40 = 90
div by both : 15+30 = 45  */

class Assignment36SumOfDivisibleNum {

	void printSumOfDivisible3or5(int[] input) {
		int sumDiv3 = 0;
		int sumDiv5 = 0;
		int sumDiv3And5 = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 3 == 0) {
				sumDiv3 += input[index];
			}
			if (input[index] % 5 == 0) {
				sumDiv5 += input[index];
			}
			if (input[index] % 3 == 0 && input[index] % 5 == 0) {
				sumDiv3And5 += input[index];
			}
		}
		System.out.println("Sum of Divisible by 3 : " + sumDiv3);
		System.out.println("Sum of Divisible by 5 : " + sumDiv5);
		System.out.println("Sum of Divisible by 3 and 5 : " + sumDiv3And5);
	}

	public static void main(String[] args) {
		int input[] = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		new Assignment36SumOfDivisibleNum().printSumOfDivisible3or5(input);
	}
}