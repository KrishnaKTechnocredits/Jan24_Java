/*1. WAP for swapping of two integers without using third variable.
2. WAP for swapping of two String without using third variable.*/
package kanchan_ghuge;

public class Assignment_93 {

	void numSwapping(int a, int b) {
		System.out.println("Befor Swapping : a = " + a + " , b= " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping : a = " + a + ", b = " + b);
	}

	void stringSwapping(String str1, String str2) {
		System.out.println("Before Swapping : str1 = " + str1 + " , str2 = " + str2);
		str1 += str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("After Swapping : str1 = " + str1 + " , str2 = " + str2);
	}

	public static void main(String[] args) {
		int a = 10, b = 20;
		String str1 = "Kanchan", str2 = "Aarav";
		Assignment_93 Assign93 = new Assignment_93();
		Assign93.numSwapping(a, b);
		System.out.println();
		Assign93.stringSwapping(str1, str2);
	}
}
