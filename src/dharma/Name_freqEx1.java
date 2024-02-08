package dharma;

public class Name_freqEx1 {

	int freqOfStringArray(String[] arr, String str) {
		int count = 0;
		for(int index=0;index<arr.length;index++) {
			if(str.equals(arr[index])) {
				count++;
			}
		}
		return count;
	}
	
	boolean isProcessDataString(String[] str, String target, int targetIndex) {
		boolean flag = false;
		for(int index=0;index<targetIndex;index++) {
			if(str[index].equals(target)) {
				return true;
			}
		}
		return flag;
	}
	
	void printFreqOfString(String[] arr) {
		for(int index=0;index<arr.length;index++) {
			if(!isProcessDataString(arr, arr[index], index)) {
				int freq = freqOfStringArray(arr, arr[index]);
				System.out.println(arr[index] + "=" + freq);
			}
		}
	}
	
	public static void main(String[] args) {
		Name_freqEx1 name_freqex1 = new Name_freqEx1();
		String[] arr = {"techno", "credits", "samikash", "varsha", "techno"};
		name_freqex1.printFreqOfString(arr);

	}

}
