package ankita_s;

public class Assignment36Array {

	void printDivisibleby3or5(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 3 == 0 || input[index] % 5 == 0) {
				sum = sum + input[index];
			}
		}
		System.out.println("Sum of nos which are divisible by 3 or 5:- " + sum);
	}

	public static void main(String[] args) {
		int[] arr = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		Assignment36Array ass36 = new Assignment36Array();
		ass36.printDivisibleby3or5(arr);
	}
}
