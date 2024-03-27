package rohini_deshmane.general_programs;
/*
 * Assignment - 93 : 25th March'2024 [18-20 mins]
1. WAP for swapping of two integers without using third variable.
2. WAP for swapping of two String without using third variable.
 */
import java.io.InputStream;
import java.util.Scanner;

public class SwappingOfNumbers {

	void SwapString(String str1, String str2) {
		String string1 = str1;
		String string2 = str2;
		System.out.println("String Before Swapping, String 1 = "+string1+" String 2 = "+string2);
		string1 = string1+string2; 
		string2 = string1.substring(0,string1.length()-string2.length());
		string1=string1.substring(string2.length());
		System.out.println("String After Swapping, String 1 = "+string1+" String 2 = "+string2);
	}
	
	void SwapNumbers(int num1, int num2) {
		int number1 = num1;
		int number2 = num2;
		System.out.println("Numbers Before Swapping, number 1 = "+number1+" number 2 = "+number2);
		number1 = number1+number2;
		number2 = number1-number2;
		number1 = number1-number2;
		System.out.println("Numbers After Swapping, number 1 = "+number1+" number 2 = "+number2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Number");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		SwappingOfNumbers swap = new SwappingOfNumbers();
		swap.SwapNumbers(number1, number2);
		
		System.out.println("\nEnter two Strings");
		String str1 = sc.next();
		String str2 = sc.next();
		swap.SwapString(str1, str2);
	}
}
