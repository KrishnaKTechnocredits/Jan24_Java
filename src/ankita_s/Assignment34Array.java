package ankita_s;

public class Assignment34Array {

	void printSumOfEvenandOddNos(int[] input) {
		int sumeven = 0, sumodd = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				sumeven = sumeven + input[index];
			}
			if (input[index] % 2 != 0) {
				sumodd = sumodd + input[index];
			}
		}
		int sum = sumeven - sumodd;
		System.out.println("sum of even nos is: " + sumeven);
		System.out.println("sum of odd nos is: " + sumodd);
		System.out.println("positive difference between even number sum and odd number sum: " + sum);
	}

	public static void main(String[] args) {
		int[] arr = { 30, 24, 19, 13, 36, 51, 11, 72 };
		Assignment34Array ass34 = new Assignment34Array();
		ass34.printSumOfEvenandOddNos(arr);
	}
}
