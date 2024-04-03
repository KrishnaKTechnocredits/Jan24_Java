package dharma;

public class Assignment93 {

	void swap2Intergers() {

		int x = 10;
		int y = 20;
		System.out.println("Numbers before swapping : x = " + x + ", y = " + y);

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Numbers after swapping : x = " + x + ", y = " + y);
	}

	void swap2String() {

		String str1 = "Hi";
		String str2 = "Hello";
		System.out.println("String before swapping : x = " + str1 + ", y = " + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - 5);
		str1 = str1.substring(str1.length() - 5, str1.length());
		System.out.println("String after swapping : x = " + str1 + ", y = " + str2);
	}
	
	public static void main(String[] args) {
		Assignment93 ass93 = new Assignment93();
		ass93.swap2Intergers();
		ass93.swap2String();
	}
}
