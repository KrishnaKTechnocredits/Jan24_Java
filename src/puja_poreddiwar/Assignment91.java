/*
 * Assignment - 91 : 25th March'2024 [45 mins]
1.Shift all the zeros at the end of array.
input : [1,0,0,12,63,4,0,0,5,6,7]
output : [1,12,16,4,5,6,7,0,0,0,0]

2.Shift all the zeros at the begining of array.
input : [1,0,0,12,63,4,0,0,5,6,7]
output : [0,0,0,0,1,12,16,4,5,6,7]
 */
package puja_poreddiwar;

import java.util.Arrays;

public class Assignment91 {

	 void get0sAtEnd(int[] arr) {

		String nonZeroEle = "";
		String zeroEle = "";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				nonZeroEle = nonZeroEle + arr[i] + ",";
			} else {
				zeroEle = zeroEle+ arr[i] + ",";
				
			}
		}
		String output = nonZeroEle + zeroEle;
		output = output.substring(0, output.length() - 1);
		String[] newArr = output.split(",");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(newArr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}
	 
	 void get0sAtBegin(int[] arr) {

			String nonZeroEle = "";
			String zeroEle = "";

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					zeroEle = zeroEle + arr[i] + ",";
				} else {
					nonZeroEle = nonZeroEle+ arr[i] + ",";
					
				}
			}
			String output = zeroEle  + nonZeroEle;
			output = output.substring(0, output.length() - 1);
			String[] newArr = output.split(",");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(newArr[i]);
			}
			System.out.println(Arrays.toString(arr));
		}

	public static void main(String[] args) {
		System.out.println("-------------Assignment_91.1-----------");
		int[] data = { 1, 0, 0, 12, 63, 4, 0, 0, 5, 6, 7 };
		new Assignment91().get0sAtEnd(data);
		
		System.out.println("-------------Assignment_91.2------------");
		
		new Assignment91().get0sAtBegin(data);
		
		
	}
}
