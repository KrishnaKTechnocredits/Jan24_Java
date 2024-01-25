package puja_poreddiwar;

public class ReturnTypeEx1 {

	void frequencyOfChar(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			String input = str.toLowerCase();
			if (ch == input.charAt(index)) {
				count++;
			}
		}
		System.out.println("Frequency of " + ch + " in technocredits is " + count);
	}

	public static void main(String[] args) {
		ReturnTypeEx1 returnTypeEx1 = new ReturnTypeEx1();
		returnTypeEx1.frequencyOfChar("technocrediTs teaches Technology", 't');
	}
}
