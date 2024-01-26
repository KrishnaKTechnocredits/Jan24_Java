package padmaja;

public class FrequencyOfChar {

	int frequncyCounter(String str, char ch) {
		int count = 0;
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			if (ch == str.charAt(index))
				count++;
		}
		System.out.println("Frequency of t in technocrediTs teaches Technology = " + count);
		return count;
	}

	public static void main(String[] args) {
		FrequencyOfChar frequncyOfChar = new FrequencyOfChar();
		frequncyOfChar.frequncyCounter("technocrediTs teaches Technology", 't');
	}
}
