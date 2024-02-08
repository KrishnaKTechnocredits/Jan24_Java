package hiral_purohit;

public class ArrayStringFreq {

	int getFreqOfArray(String[] names, String str) {
		int count = 0;
		for (int index = 0; index < names.length; index++) {
			if (str == (names[index])) {
				count++;
			}
		}
		return count;
	}

	boolean isfrqString(String[] value, String str, int target) {
		boolean flag = false;
		for (int i = 0; i < target; i++) {
			if (value[i].equals(str)) {
				return true;
			}
		}
		return flag;
	}

	void printFreq(String[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (!isfrqString(arr, arr[i], i)) {
				int count = getFreqOfArray(arr, arr[i]);
				System.out.println(arr[i] + count);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "techno", "credits", "samikash", "varsha", "techno" };
		ArrayStringFreq arrayStringFreq = new ArrayStringFreq();
		arrayStringFreq.printFreq(arr);
	}
}
