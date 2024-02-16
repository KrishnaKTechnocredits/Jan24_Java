//Print sum of negative numbers:
package atisha;

public class Assignment61 {
	void sumOfNegative(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '-') {
				ch = str.charAt(i + 1);
				sum = (sum + (Character.getNumericValue(ch)));
			}
		}
		System.out.println((-1) * sum);
	}
	public static void main(String[] args) {
		new Assignment61().sumOfNegative("te-3ch4noc7red-8its");
	}
}
