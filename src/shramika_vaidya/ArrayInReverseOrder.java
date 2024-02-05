package shramika_vaidya;

public class ArrayInReverseOrder {

	void printArrayInReverseOrder() {
		int[] arr = { 10, 20, 13, 27, 29, 13, 6 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		new ArrayInReverseOrder().printArrayInReverseOrder();
	}
}
