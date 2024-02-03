package suresh;

public class PrintLastEvenNumber {

	void printEvenNum(String input) {
		for (int i = input.length() - 1; i > 0; i--) {
			char ch = input.charAt(i);

			boolean flag = Character.isDigit(ch);
			if (flag == true)

				if (Character.getNumericValue(ch) % 2 == 0) {
					{
						System.out.println(ch);
						break;
					}
				}
		} 
	}

	public static void main(String[] args) {
		new PrintLastEvenNumber().printEvenNum("te3ch4nocred8its");
	}
}
