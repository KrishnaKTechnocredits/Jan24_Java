package shramika_vaidya;

public class SumOfArray {

	double getSumOfArray(double[] num) {
		double sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		double[] arr = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		SumOfArray sumOfArray = new SumOfArray();
		sumOfArray.getSumOfArray(arr);
	}
}
