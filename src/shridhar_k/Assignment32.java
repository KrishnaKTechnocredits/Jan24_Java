//Print all the given int array in the reverse order.
package shridhar_k;

public class Assignment32 {
	void printArrayInReverse(int[] arr) {
		for(int i = arr.length- 1 ; i >= 0 ; i-- ) {			
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 13, 27, 29, 13, 6};
		new Assignment32().printArrayInReverse(arr);
	}
}
