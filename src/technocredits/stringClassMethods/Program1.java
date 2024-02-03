package technocredits.stringClassMethods;

public class Program1 {

	static String finalVariable = "";

	public static void main(String[] args) {
		for (int i = 1; i < 20; i++) {
			isEvenNumber(i);
		}
		System.out.println("Final Output: " + finalVariable);
	}

	public static void isEvenNumber(int number) {
		if (number % 2 == 0) {
			addToFinalString(number);
		} else {
			System.out.println(number + " is not evenumber");
		}
	}

	public static void addToFinalString(int number) {
		finalVariable = finalVariable + number;
	}
}
