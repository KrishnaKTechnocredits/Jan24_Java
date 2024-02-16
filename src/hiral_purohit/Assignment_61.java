package hiral_purohit;

//"Print sum of negative numbers:
//input: te-3ch4noc7red-8its
//output: -11"
public class Assignment_61 {

	void printSumOfDigit(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '-') {
				i = i + 1;
				ch = str.charAt(i);
				int num = Character.getNumericValue(ch);
				sum = sum + (num * -1);
			}
		}
		System.out.println("Sum of negative Digit is " + sum);
	}

	public static void main(String[] args) {
		new Assignment_61().printSumOfDigit("te-3ch4noc7red-8its");
	}
}
