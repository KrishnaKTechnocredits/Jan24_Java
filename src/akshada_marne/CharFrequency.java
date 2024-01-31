package akshada_marne;

public class CharFrequency {
	void checkFreq(String s, char targetvalue) {

		int count = 0;
		s = s.toLowerCase();

		for (int index = 0; index < s.length(); index++) {
			char ch = s.charAt(index);
			if (ch == targetvalue) {
				count++;
			}
		}
		System.out.println("frequency of t in technocredits is " + count);
	}

	public static void main(String args[]) {
		CharFrequency charFrequency = new CharFrequency();
		charFrequency.checkFreq("technocrediTs teaches Technology", 't');
	}
}