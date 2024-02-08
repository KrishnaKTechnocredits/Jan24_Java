package akshay_gaikwad;

public class ReverseArray {
	void printReverseArray(int[] arr) {
		for(int index = arr.length-1; index >= 0; index--) {
			System.out.print(arr[index] + ", ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 13, 27, 29, 13, 6};
		new ReverseArray().printReverseArray(arr);
	}
}
