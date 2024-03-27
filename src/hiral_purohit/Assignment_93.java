package hiral_purohit;
/*Assignment - 93 : 25th March'2024 [18-20 mins]
1. WAP for swapping of two integers without using third variable.
2. WAP for swapping of two String without using third variable.*/

public class Assignment_93 {

	void swappingOgInteger(int a, int b) {
		System.out.println("Value of a is:" + a);
		System.out.println("Value of b is:" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value after swapping");
		System.out.println("Value of a is:" + a);
		System.out.println("Value of b is:" + b);
	}

	void swappingOfString(String str1, String str2) {
		System.out.println("Value of str1 is:" + str1);
		System.out.println("Value of str2 is:" + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("Value after swapping");
		System.out.println("Value of str1 is: " + str1);
		System.out.println("Value of str2 is: " + str2);
	}

	public static void main(String[] args) {
		Assignment_93 assignment_93 = new Assignment_93();
		assignment_93.swappingOgInteger(5, 8);
		System.out.println("...............................");
		assignment_93.swappingOfString("Hello", "World");
	}
}
