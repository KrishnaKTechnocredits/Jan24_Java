/*Program 1: Find out first missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 3
 */

package sasmita;

public class FirstMissingNumber {
	void getFirstMissingNumber(int[] arr) {
		for (int num = 1; num <= 10; num++) {
			boolean flag = false;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("1st missing number is " + num);
				break;
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 5, 6, 9, 8, 10 };
		new FirstMissingNumber().getFirstMissingNumber(arr);

	}

}
