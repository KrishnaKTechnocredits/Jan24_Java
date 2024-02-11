//Assignment - 54 : 11th Feb'2024
//Push all the zeros at the end of an array.
//int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
//output : {10,-12,6,-3,-33,44,4,0,0,0};

package prathamesh_tati.array;
import java.util.Arrays;

public class PushZerosAtEnd {

	int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
	int[] output = new int[arr.length];
	int temp;

	void rearrangeZerosAtEnd() {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				output[temp] = arr[index];
				temp++;
			}
		}

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0) {
				output[temp] = arr[index];
				temp++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		PushZerosAtEnd pushZerosAtEnd = new PushZerosAtEnd();
		pushZerosAtEnd.rearrangeZerosAtEnd();
	}
}