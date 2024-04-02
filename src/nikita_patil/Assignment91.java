package nikita_patil;
import java.util.Arrays;

public class Assignment91 {
	int[] togetOutputArray(int[] arr) {
		int[] output = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				output[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				output[j] = arr[i];
				j++;
			}
		}
		return (output);
	}

	int[] togetOutputArray2(int[] arr) {
		int[] output = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				output[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				output[j] = arr[i];
				j++;
			}
		}
		return (output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 1, 0, 0, 12, 63, 4, 0, 0, 5, 6, 7 };
		Assignment91 a = new Assignment91();
		int[] output = a.togetOutputArray(input);
		System.out.println("Variation :1");
		System.out.println(Arrays.toString(output));
		System.out.println(".................................");
		System.out.println("Variation :2");
		int[] output1 = a.togetOutputArray2(input);
		System.out.println(Arrays.toString(output1));
	}
}
