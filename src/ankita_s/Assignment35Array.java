package ankita_s;

public class Assignment35Array {

	void Assignment35Array(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				System.out.print(input[index] + " ");
				System.out.println();
				sum = sum + input[index];
			}
		}
		System.out.println("Sum of even no is: " + sum);
	}

	public static void main(String[] args) {
		int[] arr = { 3, 6, 9, 11, 15, 20, 4, 26 };
		Assignment35Array ass35 = new Assignment35Array();
		System.out.println("Eeven nos are: ");
		ass35.Assignment35Array(arr);
	}
}
