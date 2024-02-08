package akshay_gaikwad;

public class FreqOfStringArray {
	
	int freqOfStringInArray(String[] arr, String str) {
		int count = 0;	
		for (int index = 0; index < arr.length; index++) {
			if (str.equals(arr[index])) {
				count++;
			}
		}
		return count;
	}
	
	boolean isProccessedString(String[] sarr, String target, int targetIndex) {
		boolean flag = false;
		for (int index = 0; index < targetIndex ; index++) {
			if(sarr[index].equals(target)) {
				return true;
			}
		}
		return flag;
	}
	
	void printFreqOfString(String [] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (!isProccessedString(arr, arr[index], index)) {
				int freq = freqOfStringInArray(arr, arr[index]);
				System.out.println(arr[index] + " = " + freq);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] arr = {"techno", "credits", "samikash","varsha", "techno"};
		new FreqOfStringArray().printFreqOfString(arr);
	}
}
