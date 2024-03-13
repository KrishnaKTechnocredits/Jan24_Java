package ashwini_b;

/*
 Assignment - 77 : 9th March'2024
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
public class Assgnment77_MissingNumber {

   //Find out first missing number from 1 to 10.
	void find1stMissingNumber(int[] arr) {
		System.out.println("Find out first missing number from 1 to 10.");
		for (int num = 1; num < 10; num++) {
			boolean flag = false;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(num + " is missing");
				break;
			}
		}
	}

    //Find out last missing number from 1 to 10.
	void findLastMissingNumber(int[] arr) {
		System.out.println("Find out last missing number from 1 to 10");
		for (int num = 10; num > 0 ; num--) {
			boolean flag = false;
			for (int index = arr.length -1; index >= 0 ; index--) {
				if (num == arr[index]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(num + " is missing");
				break;
			}
		}
	}

	// Find out all missing number from 1 to 10.
	void findAllMissingNumber(int[] arr) {
		System.out.println("Find out all missing number from 1 to 10");
		for (int num = 1; num < 10; num++) {
			boolean flag = false;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(num + " is missing");
			}
		}
	}

	public static void main(String[] args) {
		int[] x = { 2, 4, 1, 5, 6, 9, 8, 10 };
		Assgnment77_MissingNumber assgnment77_MissingNumber = new Assgnment77_MissingNumber();
		assgnment77_MissingNumber.find1stMissingNumber(x);
		assgnment77_MissingNumber.findLastMissingNumber(x);
		assgnment77_MissingNumber.findAllMissingNumber(x);
	}

}
