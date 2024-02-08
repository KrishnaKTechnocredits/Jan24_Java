package samiksha;

public class SumOfArray {

	double printSumOfArray(double[] num) {
		double sum = 0;
		for (int index = 0; index < num.length; index++) {
			sum = sum + num[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		double[] input = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		double s =new SumOfArray().printSumOfArray(input);
		System.out.println(s);
	}
}
