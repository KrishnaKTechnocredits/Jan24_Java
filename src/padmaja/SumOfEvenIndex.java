/*Assignment - 35 : 4th Feb'2024

Return the sum of even index from the array

input : {3, 6, 9, 11, 15, 20, 4, 26}
Output : 31

hint: 3,9,15,4 */

package padmaja;

public class SumOfEvenIndex {
	int evenNumsum = 0;
	
	void printsumofEvenIndex(int[] num) {
		for (int index = 0; index < num.length; index++) {
			if (index % 2 == 0) {
				evenNumsum = evenNumsum + num[index];
				//System.out.println(num[index]);
			}
		}
		System.out.println("Sum of Even Index Nos is : " + evenNumsum);
	}

	public static void main(String[] args) {
		int[] input = { 3, 6, 9, 11, 15, 20, 4, 26 };
		SumOfEvenIndex sumOfEvenIndex = new SumOfEvenIndex();
		sumOfEvenIndex.printsumofEvenIndex(input);
	}
}
