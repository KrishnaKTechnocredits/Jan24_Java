/*
 * Return the sum of all the numbers which are divisible by 3 or 5.

input : {6, 5, 3, 15, 19, 40, 30, 27, 11}
Output : 126

Div by 3 : 6+3+27 = 36
Div by 5 : 5+40 = 45
div by both(AND condition) : 45
Total: 126
 
 */
package suresh.array;

public class SumOfNumbersDivBy3Or5 {

	void sumOfNumbers(int[] index) {
		int sum = 0;

		for (int i = 0; i < index.length; i++) {
			// if(index[i]%5==0)
			if (index[i] % 3 == 0 || index[i] % 5 == 0) {
				sum = sum + index[i];
			}
		}
		System.out.println(" sum of all the numbers which are divisible by 3 or 5 is -->" + sum);

	}

	public static void main(String[] args) {
		int[] arry = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		new SumOfNumbersDivBy3Or5().sumOfNumbers(arry);
	}
}
