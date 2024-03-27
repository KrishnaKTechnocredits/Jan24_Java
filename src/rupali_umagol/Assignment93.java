/*1. WAP for swapping of two integers without using third variable.
2. WAP for swapping of two String without using third variable.*/
package rupali_umagol;

public class Assignment93 {

	void swapNumWithouthirdVar(int num1, int num2) {
		System.out.println("Before Swap  num1: " + num1 + " num2: " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After Swap num1: " + num1 + " num2: " + num2);

	}

	void swapStringWithoutthridvar(String str1, String str2) {
		System.out.println("Before swap : str1 : " + str1 + " str2 :" + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("After swap : str1 : " + str1 + " str2 :" + str2);

	}

	public static void main(String[] args) {
		Assignment93 assignment = new Assignment93();
		assignment.swapNumWithouthirdVar(10, 20);
		System.out.println("==================");
		assignment.swapStringWithoutthridvar("Rupali", "Umagol");
	}
}
