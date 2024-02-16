/*Assignment - 61 : 16th Feb'2024

"Print sum of negative numbers:
input: te-3ch4noc7red-8its
output: -11"*/
package madhura_kulkarni;

public class Assignment61 {

	void printSumOfNegativeNum(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == '-') {
				char ch = input.charAt(i + 1);
				sum = sum + (Character.getNumericValue(ch) * (-1));
			}
		}
		System.out.println("Sum of negative numbers in string is: " + sum);
	}

	public static void main(String[] args) {
		String str = "te-3ch4noc7red-8its";
		new Assignment61().printSumOfNegativeNum(str);
	}

}
