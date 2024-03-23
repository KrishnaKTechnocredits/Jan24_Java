package puja_poreddiwar;
/*
Assignment - 82 : 14th March'2024
String str = "I am having 11 years and 3 months of experience in java selenium";
output : 14
NOTE : use Exception concept 
 */

public class Assignmnt82NoExecption {

	void getDigits(String str) {
		int sum = 0;
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			try {
				sum = sum + Integer.parseInt(str1[i]);
			} catch (NumberFormatException e) {

			}
		}
		System.out.println("Sum of digits is : " + sum);
	}

	public static void main(String[] args) {
		String str = "I am having 11 years and 3 months of experience in java selenium";
		new Assignmnt82NoExecption().getDigits(str);
	}
}
