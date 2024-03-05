package aanand;

/*Print sum of negative numbers:
input: te-3ch4noc7red-8its
output: -11*/
public class Assignment61 {
	public void printString(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '-') {
				sum = sum + (Character.getNumericValue(str.charAt(i + 1)) * -1);
			}
		}
				System.out.println("Sum of negative numbers: " + sum);
	}

	public static void main(String[] args) {
		new Assignment61().printString("te-3ch4noc7red-8its");
	}
}