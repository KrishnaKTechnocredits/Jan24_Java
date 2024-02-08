package varsha;

public class StringExample1 {

	void printStringInfo(String inputString, char character) {
		int count = 0;
		for (int index = 0; index < inputString.length(); index++) {
			char ch = inputString.charAt(index);
			if (ch == character) {
				count++;
			}
		}
		System.out.println("Frequency of " + character + " in " + inputString + " is " + count);
	}

	public static void main(String[] args) {
		StringExample1 stringExample1 = new StringExample1();
		stringExample1.printStringInfo("technocredits", 't');
	}
}
