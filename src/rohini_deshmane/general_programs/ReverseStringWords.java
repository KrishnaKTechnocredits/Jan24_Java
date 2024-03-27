package rohini_deshmane.general_programs;

import java.util.Arrays;
import java.util.Scanner;

/*
 Assignment - 94 : 25th March'2024 [18-20 mins] 
Input- Kajol is Working in Roche
Output- Roche in Working is Kajol
 */
public class ReverseStringWords {

	void reverseString(String str) {
		String[] strArr = str.split(" ");
		String reverseStr="";
		System.out.println("String before reverse = "+str);
		for(int i=strArr.length-1; i>=0; i--) {
			reverseStr = reverseStr+" "+strArr[i];
		}
		System.out.println("String after reverse = "+reverseStr);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.nextLine();
		ReverseStringWords reverseStr = new ReverseStringWords();
		reverseStr.reverseString(str);
	}
}
