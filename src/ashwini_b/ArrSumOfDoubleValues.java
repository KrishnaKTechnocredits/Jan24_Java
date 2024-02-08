package ashwini_b;

/*
 Assignment - 33 : 4th Feb'2024
 Return the sum of all given array of double type.
input :{10.20, 45.50, 34.65, 20.60, 25.46, 78.90}
Output : 215.31
 */
public class ArrSumOfDoubleValues {

	double sumOfArray(double[] num) {
		double sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		double[] num = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		ArrSumOfDoubleValues arrSumOfDoubleValues = new ArrSumOfDoubleValues();
		double sum = arrSumOfDoubleValues.sumOfArray(num);
		System.out.println("Output : " + sum);
	}

}
