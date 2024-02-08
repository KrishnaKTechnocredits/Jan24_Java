package shridhar_k;

public class ProgrammingTest1 {
	void sumOfDigit(String inputStr) {
		System.out.println("input: " + inputStr);
		int sum = 0;
		for (int index = 0; index < inputStr.length() ; index++) {
			char ch = inputStr.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag)
				sum = sum + Character.getNumericValue(ch);
		}
		System.out.println("output: " + sum);
	}
	
	public static void main(String[] arg) {
		ProgrammingTest1 programmingTest1 = new ProgrammingTest1();
		String input = "te3ch4nocred8its";
		programmingTest1.sumOfDigit(input);
		input = "technocredits";
		programmingTest1.sumOfDigit(input);
	}
}
