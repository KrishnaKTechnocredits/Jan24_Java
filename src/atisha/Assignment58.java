// print  last character with the minimum frequency..
package atisha;
public class Assignment58 {

	int countfreq(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch2 = str.charAt(i);
			if (ch2 == ch)
				count++;
		}
		return count;
	}

	void printLastminFreq(String str) {

		String nstr = str.toLowerCase();
		for (int i = nstr.length() - 1; i >= 0; i--) {
			char ch = nstr.charAt(i);
			int getfreq = countfreq(str, ch);

			if (getfreq == 1) {
				System.out.println("character with minimum frequency is :" + ch + "->" + getfreq);
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Assignment58().printLastminFreq("aakanksha");
	}

}
