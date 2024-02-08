package aanand.array;

public class Assignment34 {
	double sumOfDoubleArray(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			double number = arr[i];
			sum = sum + number;
		}
		return sum;
	}

	public static void main(String[] args) {
		double[] arr = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		Assignment34 assignment34 = new Assignment34();
		double sum = assignment34.sumOfDoubleArray(arr);
		System.out.println(sum);
	}
}