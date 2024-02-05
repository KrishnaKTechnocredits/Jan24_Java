package samiksha;

public class FrequencyArray {

	int getStringFrequency(String[] str, String targetCh) {
		int count = 0;
		for (int index = 0; index < str.length; index++) {
			String ch = str[index];
			if (targetCh.equals(ch)) {
				count++;
			}
		}
		return count;
	}

	void printFrequency(String[] str) {
		int freq = 0;
		for (int index = 0; index < str.length; index++) {
			String ch = str[index];
			int count = getStringFrequency(str, ch);
			System.out.println(str[index] + ": " + count);
		}
	}

	public static void main(String[] args) {
		String[] input = { "techno", "credits", "samiksha", "varsha", "techno" };
		new FrequencyArray().printFrequency(input);
	}
}
