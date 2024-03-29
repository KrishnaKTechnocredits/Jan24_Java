/*1.Shift all the zeros at the end of array.
input : [1,0,0,12,63,4,0,0,5,6,7]
output : [1,12,16,4,5,6,7,0,0,0,0]

2.Shift all the zeros at the begining of array.
input : [1,0,0,12,63,4,0,0,5,6,7]
output : [0,0,0,0,1,12,16,4,5,6,7]
 */
package sasmita;

import java.util.Arrays;

public class Assignment91 {

	void shiftZerosAttheBegining(int[] arr) {
		String str1 = "";
		String str2 = "";
		String str3 = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				str1 = str1 + arr[i] + " ";
			else if (arr[i] != 0)
				str2 = str2 + arr[i] + " ";
		}
		str3 = str1 + str2;
		str3.trim();
		String[] output = str3.split(" ");
		System.out.println(Arrays.toString(output));
	}

	void shiftZerosAttheend(int[] arr) {
		String str1 = "";
		String str2 = "";
		String str3 = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				str1 = str1 + arr[i] + " ";
			else if (arr[i] == 0)
				str2 = str2 + arr[i] + " ";
		}
		str3 = str1 + str2;
		str3.trim();
		String[] output = str3.split(" ");
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 12, 63, 4, 0, 0, 5, 6, 7 };
		Assignment91 assignment91 = new Assignment91();
		assignment91.shiftZerosAttheBegining(arr);
		assignment91.shiftZerosAttheend(arr);
	}

}
