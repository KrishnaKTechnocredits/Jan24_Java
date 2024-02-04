//Assignment-32
// Print all the given int array in revere order

package prathamesh_tati;

public class ArrayInReverseOrder {

	void reverseOrderArray(int[] arr) {
		for (int index = arr.length - 1; index >= 0; index--) {
			System.out.println(arr[index]);
		}
	}

	public static void main(String[] args) {
		ArrayInReverseOrder arrayInReverseOrder = new ArrayInReverseOrder();
		int[] input = { 10, 20, 13, 27, 29, 13, 6 };
		arrayInReverseOrder.reverseOrderArray(input);
	}
}
