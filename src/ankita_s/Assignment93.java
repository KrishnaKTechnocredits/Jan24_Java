package ankita_s;

public class Assignment93 {

	void printSwapNumber(int a, int b) {
		System.out.println("Numbers Before Swaping :" + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Numbers After Swaping :" + a + " " + b);
	}

	void printSwapWord(String str1, String str2) {
		System.out.println("Words Before Swaping :" + str1 + " " + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, (str1.length() - str2.length()));
		str1 = str1.substring(str2.length(), str1.length());
		System.out.println("Words After Swaping :" + str1 + " " + str2);
	}

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		String str1 = "techno", str2 = "credits";
		Assignment93 ass93 = new Assignment93();
		ass93.printSwapNumber(num1, num2);
		ass93.printSwapWord(str1, str2);
	}
}
