package nisarg_patel;

public class Assignment33SumArrayDouble {

	void printSumDoubleArray(double[] input) {
		double sum = 0;
		for (int index = (input.length - 1); index >= 0; index--) {
			sum = sum + input[index];
		}
		System.out.println("Sum Of Double Array : " + sum);
	}

	public static void main(String[] args) {
		double input[] = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		new Assignment33SumArrayDouble().printSumDoubleArray(input);
	}
}
