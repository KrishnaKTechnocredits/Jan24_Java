/*Assignment - 38 : 4th Feb'2024

Return the max & min number from given array.

input : [10,20,50,60,30]
output : min : 10 max : 60 */

package pallavi_raut;

public class FindMaxMinNumFromArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 50, 60, 30 };
		new FindMaxMinNumFromArray().printMaxMinNumFromArray(arr);
		// new FindMaxMinNumFromArray().printMaxMinNumFromArray(arr);
	}

	void printMaxMinNumFromArray(int[] num) {
		int max = 0, min = num[0];
		for (int index = 0; index < num.length; index++) {
			if (num[index] > max) {
				max = num[index];
			} else if (min > num[index]) {
				min = num[index];
			}
		}
		System.out.println(min + " is the minimum number and " + max + " is the maxium number in given array");
	}
}