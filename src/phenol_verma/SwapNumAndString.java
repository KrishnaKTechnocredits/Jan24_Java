/*
 * Assignment - 93 : 25th March'2024 [18-20 mins]
 * PhenolV_Assignment_101
1. WAP for swapping of two integers without using third variable.
2. WAP for swapping of two String without using third variable.
 */
package phenol_verma;

public class SwapNumAndString {

	void swapDigit(int num1, int num2) {
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After Swap Num1 = " + num1 + " After Swap Num2 = " + num2);
	}

	void swapString(String str1, String str2) {

		str1 = str1.concat(str2);
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("After Swap String1 = " + str1 + " After Swap String2 = " + str2);
	}

	public static void main(String[] args) {
		SwapNumAndString swapNumAndString = new SwapNumAndString();
		int num1 = 20;
		int num2 = 10;
		System.out.println("Original Num1 = " + num1 + " Original Num2 = " + num2);
		swapNumAndString.swapDigit(num1, num2);
		System.out.println("*********************************************");
		String str1 = "Phenol";
		String str2 = "Verma";
		System.out.println("Original Srting1 = " + num1 + " Original String2 = " + num2);
		swapNumAndString.swapString(str1, str2);
	}
}
