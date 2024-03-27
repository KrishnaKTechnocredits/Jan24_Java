package hiral_purohit;
/*1. find the second highest number from given array without using sorting and using array.
input : {2,22,3,55,66,77,77,34,26}
output : 66*/

public class Assigment_95_p1 {

	void toGetSecondMax(int[] arr) {
		int max = 0;
		int secondMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				secondMax = max;
				max = arr[i];
			} else if (secondMax < arr[i] && max != arr[i]) {
				secondMax = arr[i];
			}
		}
		System.out.println("max no is: " + max);
		System.out.println("Second max no is: " + secondMax);
	}

	public static void main(String[] args) {
		int[] input = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		new Assigment_95_p1().toGetSecondMax(input);
	}
}
