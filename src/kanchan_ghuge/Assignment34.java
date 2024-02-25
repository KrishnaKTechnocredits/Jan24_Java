package kanchan_ghuge;

/*Assignment - 34 : 4th Feb'2024

Return the positive difference between even number sum and odd number sum.

input : {30, 24, 19, 13, 36, 51, 11, 72}
Output : 162 - 94 = 68

evenNum= 30+24+36+72 =162
Odd= 19+13+51+11 = 94  */

class Assignment34 {

	void DiffBetweenEvenAndOddNum(int[] input) {
		int evensum = 0;
		int oddsum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				evensum += input[index];
			else
				oddsum += input[index];
		}
		if (evensum > oddsum)
			System.out.println("Positive difference between even number sum and odd number is : " + (evensum - oddsum));
		else
			System.out.println("Positive difference between even number sum and odd number is : " + (oddsum - evensum));
	}

	public static void main(String[] args) {
		int input[] = { 30, 24, 19, 13, 36, 51, 11, 72 };
		new Assignment34().DiffBetweenEvenAndOddNum(input);
	}
}
