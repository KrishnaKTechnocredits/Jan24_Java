package hiral_purohit;

public class ReverseArray {
	
	void printReverse(int[]num) {
		for(int index = num.length - 1; index >= 0; index--) {
			System.out.println(num[index]);
		}
	}
	
	public static void main(String[] args) {
		ReverseArray reverseArray = new ReverseArray();
		int[] arr = {10, 20, 13, 27, 29, 13, 6};
		reverseArray.printReverse(arr);
	}

}
