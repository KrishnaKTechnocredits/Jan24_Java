package ashwini_b;

/*
 Assignment - 93 : 25th March'2024 [18-20 mins]
1. WAP for swapping of two integers without using third variable.
2. WAP for swapping of two String without using third variable.
 */
public class Assgnment93_Swapping {

	void swapTwoIntegers() {
		int num1 = 10;
		int num2 = 20;
		System.out.println("Before swap num1 and num2 are: " + num1 + " " + num2);
		num1 = num1 + num2; // 10 + 20 =30
		num2 = num1 - num2; // 30 -20 = 10
		num1 = num1 - num2; // 30 - 10 = 20
		System.out.println("After swap num1 and num2 are: " + num1 + " " + num2);
		
	}

	void swapTwoString() {
		String str1 = "techno";
		String str2 = "credits";
		System.out.println("String before swap: " + str1 + " " + str2);
		str1 = str1 + str2; // str1 = techno credits
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("String after swap: " + str1 + " " + str2);
		
	}

	public static void main(String[] args) {
		Assgnment93_Swapping assgnment93_Swapping = new Assgnment93_Swapping();
		assgnment93_Swapping.swapTwoIntegers();
		System.out.println("-----------------------------------");
		assgnment93_Swapping.swapTwoString();
	}

}
