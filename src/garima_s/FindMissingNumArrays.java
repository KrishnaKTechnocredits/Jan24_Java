/*Program 1: Find out first missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 3

Program 2 : Find out last missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 7

Program 3 : Find out all missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 3,7
*/

package garima_s;

public class FindMissingNumArrays {

	void getFirstMissingNum(int[] arr) {
		for (int i = 1; i <= 10; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("First Missing Number : " + i);
				break;
			}
		}
	}

	void getLastMissingNum(int[] arr) {
		for (int i = 10; i >= 1; i--) {
			boolean flag = false;
			for (int j = arr.length - 1; j >= 0; j--) {
				if (arr[j] == i) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Last Missing Number : " + i);
				break;
			}
		}
	}

	void getAllMissingNum(int[] arr) {
		for (int i = 1; i <= 10; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] x = { 2, 4, 1, 5, 6, 9, 8, 10 };
		FindMissingNumArrays findMissingNumArrays = new FindMissingNumArrays();
		findMissingNumArrays.getFirstMissingNum(x);
		findMissingNumArrays.getLastMissingNum(x);
		System.out.print("All Missing Numbers : ");
		findMissingNumArrays.getAllMissingNum(x);

	}
}
