package technocredits.collectionsframework.mapdemo;

public class Example4 {
	
	int getFreqOfNumber(int[] arr, int num) {
		int count = 0;
		for(int currentNumber : arr) {
			if(currentNumber == num)
				count++;
		}
		return count;
	}
	
	void printUniqueWordArray(int[] arr) {
		for(int num : arr) {
			int count = getFreqOfNumber(arr, num);
			if(count == 1)
				System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10,10,3,4,3,3,3,3,55,56};
		new Example4().printUniqueWordArray(arr);
	}
}
