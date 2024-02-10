/*
 	Assignment - 52 : 10th Feb'2024

	String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
	output : {134,56,47,0}
 */

package puja_poreddiwar;

public class ArrayPrintDigits {

	int printDigitsFromStringArray(String arr) {
		String temp = "0";
		for (int index = 0; index < arr.length(); index++) {
			char ch = arr.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			}
		}
		return Integer.parseInt(temp);
	}

	int[] printDigitsArray(String[] arr) {
		int[] arr1 = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			arr1[index] = printDigitsFromStringArray(arr[index]);
			System.out.println(arr1[index]);
		}
		return arr1;
	}

	public static void main(String[] args) {
		String[] names = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		ArrayPrintDigits Arr1 = new ArrayPrintDigits();
		Arr1.printDigitsArray(names);
	}
}
