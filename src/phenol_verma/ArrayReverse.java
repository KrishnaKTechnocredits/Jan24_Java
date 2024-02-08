/*
 * Assignment - 32 : 4th Feb'2024	
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
package phenol_verma;


public class ArrayReverse {
	void revAry(int arr[]) {
		int index = 0;
		System.out.print("{");
		for (index = arr.length - 1; index >= 0; index--) {
			System.out.print(arr[index]);
			if (index > 0) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		ArrayReverse arrayReverse = new ArrayReverse();
		int arr[] = { 10, 20, 13, 27, 29, 13, 6 };
		System.out.print("Output - ");
		arrayReverse.revAry(arr);
	}
}
