/*Assignment - 34 : 4th Feb'2024

Return the positive difference between even number sum and odd number sum.

input : {30, 24, 19, 13, 36, 51, 11, 72}
Output : 162 - 94 = 68

evenNum= 30+24+36+72 =162
Odd= 19+13+51+11 = 94 
--------------------------------------------------------------------------*/
package madhura_kulkarni;

public class Assignment34 {

	void diffBetweenEvenandOddNum(int[] input) {
		int evensum = 0, oddsum = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 == 0)
				evensum = evensum + input[i];
			else
				oddsum = oddsum + input[i];
		}
		if (evensum > oddsum)
			System.out.println("positive difference between sum of even and odd numbers is: " + (evensum - oddsum));
		else
			System.out.println("positive difference between sum of even and odd numbers is: " + (oddsum - evensum));

	}

	public static void main(String[] args) {
		int arr[] = { 30, 24, 19, 13, 36, 51, 11, 72 };
		Assignment34 ass = new Assignment34();
		ass.diffBetweenEvenandOddNum(arr);
	}

}
