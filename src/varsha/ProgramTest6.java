package varsha;



import java.util.Arrays;

public class ProgramTest6 {

	static int[] getNumber(int[] arr) {
		int count = 0;
		for (int i : arr) {
			if (i % 5 == 0) {
				count++;
			}
		}
		int[] output = new int[count];
		int index = 0;
		for (int i : arr) {
			if (i % 5 == 0) {
				output[index] = i;
				index++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 10, 32, 44, 55, 25, 23 };
		int[] output = getNumber(input);
		System.out.println(Arrays.toString(output));
	}
}
