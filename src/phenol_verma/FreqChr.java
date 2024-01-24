package phenol_verma;

public class FreqChr {
	int count = 0;
	void chrcount(char chr, String str) {
		str = str.toLowerCase();
		for (int index = 0; index <= str.length() - 1; index++) {
			if (chr == str.charAt(index)) {
				count++;
			}
		}
		System.out.println("Frequency of t in technocredits is  " + count);
	}
	public static void main(String[] args) {
		FreqChr freqChr = new FreqChr();
		freqChr.chrcount('t', "technocrediTs teaches Technology");
	}
}
