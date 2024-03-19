package phenol_verma;

import java.util.Arrays;

public class ReturnArrayDivByFive {

	int[] returnArray(int[] arr) {

		int lenght = arr.length;
		int count = 0;

		for (int index = 0; index < lenght; index++) {
			if (arr[index] % 5 == 0) {
				count++;
			}
		}

		int[] outputArr = new int[count];
		int arrCount = 0;
		for (int index = 0; index < lenght; index++) {
			if (arr[index] % 5 == 0) {
				outputArr[arrCount] = arr[index];
				arrCount++;
			}
		}
		return outputArr;
	}

	public static void main(String[] args) {
		ReturnArrayDivByFive returnArrayDivByFive = new ReturnArrayDivByFive();
		int[] arr = { 10, 32, 50, 44, 25, 30 };

		int[] outputArray = returnArrayDivByFive.returnArray(arr);
		System.out.println(Arrays.toString(outputArray));

	}

}
