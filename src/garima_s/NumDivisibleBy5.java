package garima_s;
import java.util.Arrays;

public class NumDivisibleBy5 {

	int[] getNumbers(int[] input) {
		int count = 0;
		for (int i=0;i<input.length;i++) {
			if (input[i] % 5 == 0) {
				count++;
			}
		}
		int[] output = new int[count];
		int index = 0;
		for(int j=0;j<input.length;j++) {
			if (input[j] % 5 == 0) {
				output[index] = input[j];
				index++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 10, 32, 44, 55, 25, 23 };
		int[] output = new NumDivisibleBy5().getNumbers(input);
		System.out.println(Arrays.toString(output));
	}
}
