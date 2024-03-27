package varsha;

//1. WAP for swapping of two integers without using third variable.
//2. WAP for swapping of two String without using third variable.
//Expected = 18-20min : Actual = 10min;

public class SwapTheElement {

	void swapInteger() {
		int num1 = 10;
		int num2 = 20;
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}

	void swapString() {
		String str1 = "Hi";
		String str2 = "Hello";

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - 5);
		str1 = str1.substring(str2.length(), str1.length());
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
	}

	public static void main(String[] args) {
		SwapTheElement swapTheElement = new SwapTheElement();
		swapTheElement.swapInteger();
		System.out.println();
		swapTheElement.swapString();
	}
}
