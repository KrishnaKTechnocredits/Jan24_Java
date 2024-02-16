package ankita_s;

public class Assignment57 {

	void square(String input) {
		int Multiplication = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			boolean temp = Character.isDigit(ch);
			int temp1 = Character.getNumericValue(ch);
			if (temp == true && temp1 % 2 != 0) {
				Multiplication = (Multiplication + (temp1 * temp1));
			}
		}
		System.out.println("squares of odd digits:- " + Multiplication);
	}

	public static void main(String[] args) {
		String Str = "te3ch4noc7red8its";
		Assignment57 ass57 = new Assignment57();
		ass57.square(Str);
	}
}
