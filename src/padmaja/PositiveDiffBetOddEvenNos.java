/*Assignment - 34 : 4th Feb'2024

Return the positive difference between even number sum and odd number sum.

input : {30, 24, 19, 13, 36, 51, 11, 72}
Output : 162 - 94 = 68

evenNum= 30+24+36+72 =162
Odd= 19+13+51+11 = 94 
*/

package padmaja;

public class PositiveDiffBetOddEvenNos {
	int evenNumsum = 0;
	int oddNumsum = 0;

	void getSumofoddandEvenNos(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				evenNumsum = evenNumsum + input[index];
			else
				oddNumsum = oddNumsum + input[index];
		}
		
		System.out.println("Sum of Even Nos : " + evenNumsum);
		System.out.println("Sum of Odd Nos : " + oddNumsum);
		
		if (evenNumsum < oddNumsum)
			System.out.println("Psotive Diff between Even and Odd nos : " + (oddNumsum - evenNumsum));
		else
			System.out.println("Psotive Diff between Even and Odd nos : " + (evenNumsum - oddNumsum));
	}

	public static void main(String[] args) {
		int[] input = { 30, 24, 19, 13, 36, 51, 11, 72 };
		PositiveDiffBetOddEvenNos diff = new PositiveDiffBetOddEvenNos();
		diff.getSumofoddandEvenNos(input);
	}
}
