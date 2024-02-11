package shafaque;

public class ArrayFrequency {

	int getFreqCount(String[] str, String arr) {
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			String temp = str[i];
			if (temp == arr) {
				count++;
			}
		}
		return count;
	}

	void printfreq(String[] arr) {
		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			value = getFreqCount(arr, arr[i]);
			System.out.println("" + arr[i] + "=" + value);

		}
	}

	public static void main(String[] args) {
		String[] arr = { "techno", "credits", "samikash", "varsha" };
		new ArrayFrequency().printfreq(arr);

	}

}
