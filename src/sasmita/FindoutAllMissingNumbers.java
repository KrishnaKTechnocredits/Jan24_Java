/*Program 3 : Find out all missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 3
         7 
 */

package sasmita;

public class FindoutAllMissingNumbers {

	void getAllmissingNumber(int[] arr) {
		for (int num = 1; num <= 10; num++) {
			boolean flag = false;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("output :" +num);

			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 5, 6, 9, 8, 10 };
		new FindoutAllMissingNumbers().getAllmissingNumber(arr);

	}

}