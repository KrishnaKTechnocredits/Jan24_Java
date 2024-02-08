/*Assignment - 38 : 4th Feb'2024

Return the max & min number from given array.

input : [10,20,50,60,30]
output : min : 10 max : 60 */

package padmaja;

public class MaxAndMinNosFromArray {

	void getMaxandMinNos(int[] num) {
		int maxNo = num[0];
		int minNo = num[0];
		for (int index = 0; index < num.length; index++) {
			if (num[index] > maxNo)
				maxNo = num[index];
			else if (num[index] < minNo)
				minNo = num[index];
		}
		System.out.println("Max no is " + maxNo);
		System.out.println("Min no is " + minNo);
	}

	public static void main(String[] agr) {
		int[] input = { 10, 20, 50, 60, 30 };
		MaxAndMinNosFromArray maxAndMinNos = new MaxAndMinNosFromArray();
		maxAndMinNos.getMaxandMinNos(input);
	}
}
