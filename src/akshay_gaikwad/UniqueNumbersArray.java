package akshay_gaikwad;

public class UniqueNumbersArray {
	
	void printUniqueNumber(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(getFreqOfnum(arr, arr[i]) == 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	int getFreqOfnum(int[] arr,int num) {
		int count = 0;
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] == num) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {10,5,5,6,9,7,15,12,15,18,8};
		new UniqueNumbersArray().printUniqueNumber(arr);
	}
}
