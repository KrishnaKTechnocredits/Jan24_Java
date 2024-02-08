package priya_t;

public class Assignment33_DoubleArraySum {

	double getsum(double[] arr) {
		double sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum = sum + arr[index];
			System.out.println("Sum of given double array is " + sum);
		}
		return sum;
    }

	public static void main(String[] args) {
		double[] arr = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		Assignment33_DoubleArraySum doubleArray = new Assignment33_DoubleArraySum();
		int temp = 20;
		doubleArray.getsum(arr);

	}

}
