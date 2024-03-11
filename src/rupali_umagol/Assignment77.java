/*Program 1: Find out first missing number from 1 to 10.
int[] x = {2,4,1,5,6,9,8,10};
output : 3
Program 2 : Find out last missing number from 1 to 10.
int[] x = {2,4,1,5,6,9,8,10};
output : 7
Program 3 : Find out all missing number from 1 to 10.
int[] x = {2,4,1,5,6,9,8,10};
output : 3
         7 */
package rupali_umagol;

public class Assignment77 {
	void getFirstMissingNum(int[] arr) {
		for (int i = 1; i <= 10; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("first missing number : " + i);
				break;
			}
		}
	}

	void getLastMissingNum(int[] arr) {
		for (int i = 10; i >= 1; i--) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Last missing number : " + i);
				break;
			}
		}
	}

	void getAllMissingNum(int[] arr) {
		for (int i = 1; i <= 10; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Missing number : " + i);
			}
		}
	}

	public static void main(String[] args) {
		Assignment77 assignment77 = new Assignment77();
		int[] arr = { 2, 4, 1, 5, 6, 9, 8, 10 };
		assignment77.getFirstMissingNum(arr);
		assignment77.getLastMissingNum(arr);
		assignment77.getAllMissingNum(arr);
	}
}
