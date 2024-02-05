/*Assignment - 32 : 4th Feb'2024	

Print all the given int array in the reverse order.

input : {10, 20, 13, 27, 29, 13, 6}
Output : 6
		 13
		 29
		 27
		 13
		 20
		 10
*/

package padmaja;

public class PrintArrayInReverseOrder {

	void printArray(int[] num) {
		System.out.println("Input Array is : ");
		for (int index = 0; index < num.length; index++) {
			System.out.println(num[index]);
		}
		System.out.println("Array in Revesre order is : ");
		for (int index = num.length - 1; index >= 0; index--) {
			System.out.println(num[index]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 13, 27, 29, 13, 6 };
		PrintArrayInReverseOrder array = new PrintArrayInReverseOrder();
		array.printArray(arr);
	}
}
