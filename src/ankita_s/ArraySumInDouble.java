package ankita_s;

public class ArraySumInDouble {
	void printArraySumInDouble(double[] input) {
		double sum = 0;
		for (int index = 0; index < input.length; index++) {
			sum = sum + input[index];
		}
		System.out.println("sum of duble is:- " + sum);
	}

	public static void main(String[] args) {
		double[] arr = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		ArraySumInDouble arraySumInDouble = new ArraySumInDouble();
		arraySumInDouble.printArraySumInDouble(arr);
	}
}
