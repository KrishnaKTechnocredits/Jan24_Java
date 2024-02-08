/*Assignment - 19 : 24th Jan'2024
Print the frequency of the given character from the given String without case sensitivity (count lower + upper case), please consider given character will be passed as lowercase.

Input : technocrediTs teaches Technology.
Char: t
Output : frequency of t in technocredits is 4.*/
package phenol_verma;

public class FreqChr {
	int count = 0;

	int chrcount(char chr, String str) {
		str = str.toLowerCase();
		for (int index = 0; index <= str.length() - 1; index++) {
			if (chr == str.charAt(index)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		FreqChr freqChr = new FreqChr();
		freqChr.chrcount('t', "technocrediTs teaches Technology");
		System.out.println("Frequency of t in technocredits is  " + freqChr.count);
	}
}
