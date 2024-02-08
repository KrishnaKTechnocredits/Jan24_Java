//Assignment - 32 : 4th Feb'2024

package puja_poreddiwar;

public class ReverseOrder {
	
	int[] arr = {10, 20, 13, 27, 29, 13, 6};
	
	void pringReverseOrderArr() {
		for(int index = arr.length- 1; index >= 0; index--) {
			System.out.println(arr[index]);
		}
	}

	public static void main(String[] args) {
		ReverseOrder reverseOrder = new ReverseOrder();
		reverseOrder.pringReverseOrderArr();
	}
}
