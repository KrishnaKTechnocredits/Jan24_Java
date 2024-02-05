package shravani_rapelli;

public class Assignment37 {
	int getFrequencyOfNamesInArray(String[] names, String str) {
		int count = 0;
		for (int i = 0; i < names.length; i++) {
			if (str == names[i]) {
				count++;
			}
		}
		return count;
	}

	boolean getFreqOfString(String[] input, String str, int targetString) {
		boolean isflag = false;
		for (int index = 0; index < targetString; index++) {
			if (input[index].equals(str)) {
				return true;
			}
		}
		return isflag;
	}

	void printFreq(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (!getFreqOfString(arr, arr[i], i)) {
				int count = getFrequencyOfNamesInArray(arr, arr[i]);
				System.out.println(arr[i] + " -> " + count);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "techno", "credits", "samiksha", "varsha", "techno" };
		Assignment37 assign37= new Assignment37();
		assign37.printFreq(arr);
	}
}
	
	
