package hiral_purohit;

public class SumOfArray {

	void printSumOfDouble(double[] digit) {
		double sum = 0;
		for (int i = 0; i < digit.length; i++) {
			sum = sum + (digit[i]);
		}
		System.out.println("sum of given araay is : " + sum);
	}

	public static void main(String[] args) {
		SumOfArray sumOfArray = new SumOfArray();
		double[] arr = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		sumOfArray.printSumOfDouble(arr);
	}
}
