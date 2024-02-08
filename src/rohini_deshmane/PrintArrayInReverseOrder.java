package rohini_deshmane;

public class PrintArrayInReverseOrder {

	void reverseArray(int[] arr) {
		for(int i=arr.length-1; i >=0 ; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		PrintArrayInReverseOrder arrayPrint = new PrintArrayInReverseOrder();
		int[] arr = {10, 20, 13, 27, 29, 13, 6};
		arrayPrint.reverseArray(arr);
	}
}
