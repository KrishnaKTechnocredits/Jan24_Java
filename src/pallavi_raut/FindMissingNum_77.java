/*Assignment - 77 : 9th March'2024
Program 1: Find out first missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 3

Program 2 : Find out last missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 7

Program 3 : Find out all missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 3
         7 
*/
package pallavi_raut;

class FindMissingNum_77 {
	public static void main(String[] args) {
		int[] x = { 2, 4, 1, 5, 6, 9, 8, 10 };
		FindMissingNum_77 findMissingNum = new FindMissingNum_77();

		// Shystem.out.println("Input Array - " + Arrays.toString(x));

		// System.out.print("First missing number from 1 to 10 - ");
		findMissingNum.firstMissingNum(x);

		// System.out.print("Last missing number from 1 to 10 - ");
		findMissingNum.lastMissingNum(x);

		// System.out.print("All missing number from 1 to 10 - ");
		findMissingNum.findAllMissingNum(x);
	}

	void firstMissingNum(int[] arr) {
		for (int i = 1; i <= 10; i++) {
			boolean flag = false;
			for (int index = 0; index < arr.length; index++) {
				if (i == arr[index]) {
					flag = true;
					break;
				}
			}

			if (flag == false) {
				System.out.println("First missing number in array " + i);
				break;
			}
		}
	}

	void lastMissingNum(int[] arr) {
		for (int i = 10; i >= 1; i--) {
			boolean flag = false;
			for (int index = 0; index < arr.length; index++) {
				if (i == arr[index]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Last missing number in array " + i);
				break;

			}
		}
	}

	void findAllMissingNum(int[] arr) {
		for (int i = 1; i <= 10; i++) {
			boolean flag = false;
			for (int index = 0; index < arr.length; index++) {
				if (i == arr[index]) {
					flag = true;
					break;
				}
			}

			if (flag == false) {
				System.out.print(i + " ");
			}
		}
	}
}