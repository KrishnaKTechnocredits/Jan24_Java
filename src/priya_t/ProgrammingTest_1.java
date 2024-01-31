package priya_t;

public class ProgrammingTest_1 {

	public static void main(String[] args) {

		int sum = 0;
		String s = "te3ch4nocred8its";

		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (Character.isDigit(temp)) {
				int b = Integer.parseInt(String.valueOf(temp));
				sum = sum + b;
			}
		}
		System.out.println(sum);
	}

}
