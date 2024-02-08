package sasmita;

public class LastEvenNumber {

	void lastEvenNumberinString(String str) {
		int lastevennumber = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) && Character.getNumericValue(ch) % 2 == 0) {
				lastevennumber = Character.getNumericValue(ch);
			}
		}
		System.out.println("Last even number from the string  " + str + " is " + lastevennumber);
	}

	public static void main(String[] args) {
		LastEvenNumber lastevennum = new LastEvenNumber();
		lastevennum.lastEvenNumberinString("te3ch4cred8its");
	}
}
