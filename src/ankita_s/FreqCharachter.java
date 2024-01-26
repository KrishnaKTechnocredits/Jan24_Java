package ankita_s;

public class FreqCharachter {
	void printFreqCharachter(String str, char ch) {
		int count = 0;
		System.out.println("Given string is:- " + str);
		System.out.println("Given string in lower case:- " + str.toLowerCase());
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			char letter = str.charAt(index);
			if (letter == ch)
				count++;
		}
		System.out.println("frequency of t in technocredits is:-" + count);
	}

	public static void main(String[] args) {
		FreqCharachter freqCharachter = new FreqCharachter();
		freqCharachter.printFreqCharachter("technocrediTs teaches Technology", 't');
	}
}
