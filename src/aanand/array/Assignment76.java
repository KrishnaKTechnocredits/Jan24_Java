/*please give this as assignment with condition,
- create array with max number
- create array with min number
- Create new array with elements of both array (lenght1 + length2) [union of arrays]
- add array element (index to index) and sort*/
package aanand.array;


import java.util.Arrays;

public class Assignment76 {

	int[] minNumberArray(int[] num1, int[] num2) {
		int[] output = new int[num1.length];
		for (int index = 0; index < num1.length; index++) {
			if (num1[index] > num2[index]) {
				output[index] = num2[index];
			} else {
				output[index] = num1[index];
			}
		}
		return output;
	}

	int[] maxNumberArray(int[] num1, int[] num2) {
		int[] output = new int[num1.length];
		for (int index = 0; index < num1.length; index++) {
			if (num1[index] > num2[index]) {
				output[index] = num1[index];
			} else {
				output[index] = num2[index];
			}
		}
		return output;
	}

	int[] unioneOfArray(int[] num1, int[] num2) {
		int temp = 0;
		int[] output = new int[num1.length + num2.length];

		for (int i = 0; i < output.length; i++) {
			if (i < num1.length) {
				output[i] = num1[i];
			} else {
				output[i] = num2[temp];
				temp++;
			}
		}
		return output;
	}

	int[] sumOfArrayElement(int[] arr1, int[] arr2) {
		int[] sumOfArray = new int[arr1.length];
		for (int i = 0; i < sumOfArray.length; i++) {
			sumOfArray[i] = arr1[i] + arr2[i];
		}
		return sumOfArray;
	}

	void display(int[] arr1, int[] arr2) {
		System.out.println("Original 1st Array: " + Arrays.toString(arr1));
		System.out.println("");
		System.out.println("Original 2nd Array: " + Arrays.toString(arr2));
		System.out.println("");
		System.out.print("Min number array");
		int[] minOutput = minNumberArray(arr1, arr2);
		System.out.println(Arrays.toString(minOutput));
		System.out.println("");

		System.out.print("Max number array");
		int[] maxOutput = maxNumberArray(arr1, arr2);
		System.out.println(Arrays.toString(maxOutput));
		System.out.println("");

		System.out.print("Union of both array: ");
		int[] union = unioneOfArray(arr1, arr2);
		System.out.println(Arrays.toString(union));
		System.out.println("");

		System.out.print("Sum of both Array: ");
		int[] sum = sumOfArrayElement(arr1, arr2);
		System.out.println(Arrays.toString(sum));
		System.out.println("");
	}

	public static void main(String[] args) {
		int[] num1 = { 23, 34, 46, 67, 87 };
		int[] num2 = { 65, 43, 78, 45, 90 };
		Assignment76 assignment76 = new Assignment76();
		assignment76.display(num1, num2);
	}

}
