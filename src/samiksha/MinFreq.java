package samiksha;

public class MinFreq {

	int getFreq(String str, char targetCh){
		int count = 0;
		for (int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
			if (ch == targetCh) {
				count++;
			}
		}
		return count;
	}

	void printLastFrquency(String str) {
		int minCount = 100;
		char minChar = ' ';
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int count = getFreq(str, ch);
			if (minCount >= count) {
				minCount = count;
				if (minCount == 1) {
					minChar = ch;
				}
			}
		}
		System.out.println(minChar + " >- " + minCount);
	}

	public static void main(String[] args) {
		String str = "aakanksha";
		new MinFreq().printLastFrquency(str);
	}
}
