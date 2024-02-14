package samiksha;

public class RearrangeNumbers {

	int[] printNumbers(int[] num) {
		int arr[] = new int[num.length];
		for (int j = 0; j < arr.length; j++) {
			for (int index = 0; index < num.length; index++) {
				if (num[index] < 0) {
					arr[j] = num[index];
					j++;
				}
			}
			for (int index = 0; index < num.length; index++) {
				if (num[index] > 0) {
					arr[j] = num[index];
					j++;
				}
			}
		}
		return arr;

	}

	public static void main(String[] args) {
		int[] input = { 10, -12, 6, -3, 33, 44, 4 };
		RearrangeNumbers numbers = new RearrangeNumbers();
		int[] output=numbers.printNumbers(input);
		for(int j=0;j< output.length;j++){
			System.out.print(output[j] + " ");
		}
	}
}
