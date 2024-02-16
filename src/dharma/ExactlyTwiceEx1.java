package dharma;

public class ExactlyTwiceEx1 {

	int toGetExactlyTwice(String str,char c) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == c) {
				count++;
			}
		}
		return count;
	}
	
	void printCharacterExactlytwice(String input) {
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int toGetExactlyTwice = toGetExactlyTwice(input, ch);
			if (toGetExactlyTwice == 2) {
				if (input.indexOf(ch) == i) 
					System.out.print(ch);
			}	
		}
	}
	public static void main(String[] args) {
		ExactlyTwiceEx1 etex1 = new ExactlyTwiceEx1();
		etex1.printCharacterExactlytwice("teecccchhhnno");
	}

}
