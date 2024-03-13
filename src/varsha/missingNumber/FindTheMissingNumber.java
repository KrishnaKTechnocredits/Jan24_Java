package varsha.missingNumber;

//Program 1: Find out first missing number from 1 to 10.
//
//int[] x = {2,4,1,5,6,9,8,10};
//output : 3
//
//Program 2 : Find out last missing number from 1 to 10.
//
//int[] x = {2,4,1,5,6,9,8,10};
//output : 7
//
//Program 3 : Find out all missing number from 1 to 10.
//
//int[] x = {2,4,1,5,6,9,8,10};
//output : 3
//        7 

public class FindTheMissingNumber {

	void printFirstMissingNumberFromArray(int[] arr) {
		boolean flag = false;
		for (int i = 1; i <= 10; i++) {
			flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("First Missing Number in Array -> " + i);
				break;
			}
		}
	}

	void printLastMissingNumberFromArray(int[] arr) {
		boolean flag = false;
		for (int i = 10; i >= 1; i--) {
			flag = false;
			for (int j = arr.length - 1; j >= 0; j--) {
				if (i == arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Last Missing Number in Array-> " + i);
				break;
			}
		}
	}

	void printAllMissingNumberFromArray(int[] arr) {
		boolean flag = false;
		for (int i = 1; i <= 10; i++) {
			flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("All Missing Number -> " + i);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 5, 6, 9, 8, 10 };
		FindTheMissingNumber findTheMissingNumber = new FindTheMissingNumber();
		findTheMissingNumber.printFirstMissingNumberFromArray(arr);
		findTheMissingNumber.printLastMissingNumberFromArray(arr);
		findTheMissingNumber.printAllMissingNumberFromArray(arr);
	}
}
