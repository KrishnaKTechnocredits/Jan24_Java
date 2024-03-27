package garima_s;

public class Assignment_93 {
	void swapNumber(int a, int b) {
		System.out.println("Numbers Before Swaping :" + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Numbers After Swaping :" + a + " " + b);
	}

	void swapWord(String str1, String str2) {
		System.out.println("Words Before Swaping :" + str1 + " " + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, (str1.length() - str2.length()));
		str1 = str1.substring(str2.length(), str1.length());
		System.out.println("Words After Swaping :" + str1 + " " + str2);
	}

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		String str1 = "techno", str2 = "credits";
		Assignment_93 assignment_93 = new Assignment_93();
		assignment_93.swapNumber(num1, num2);
		assignment_93.swapWord(str1, str2);
	}
}
