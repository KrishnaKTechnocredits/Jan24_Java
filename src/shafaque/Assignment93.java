package shafaque;

public class Assignment93 {

	void numSwapping(int a, int b) {
		System.out.println("Before swapping numbers are: a = " + a + " , b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping numbers are: a = " + a + " , b = " + b);
	}

	void stringSwapping(String str1, String str2) {
		System.out.println("Before swapping strings are: str1 = " + str1 + " , str2 = " + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("After swapping strings are: str1 = " + str1 + " , str2 = " + str2);

	}

	public static void main(String[] args) {
		int a = 30, b = 80;
		String str1 = "Shafaque", str2 = "Shwetali";
		Assignment93 ass93 = new Assignment93();
		ass93.numSwapping(a, b);
		System.out.println();
		ass93.stringSwapping(str1, str2);
	}
}
