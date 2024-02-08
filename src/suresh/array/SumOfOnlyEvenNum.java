/*
 * input : {3, 6, 9, 11, 15, 20, 4, 26}
Output : 31

hint: 3,9,15,4
  
 *
 */

package suresh.array;

public class SumOfOnlyEvenNum {

	void sumOfEven(int[] index) {
		int evenSum = 0;

		for (int i = 0; i < index.length; i++) {
			if (index[i] % 2 == 0) {
				evenSum = evenSum + index[i];
			}
		}
		System.out.println("Sum of even numbers " + evenSum);
	}

	public static void main(String[] args) {
		int[] arr = { 3, 6, 9, 11, 15, 20, 4, 26 };
		new SumOfOnlyEvenNum().sumOfEven(arr);
	}
}