package gaurav_garg;

public class SumOfGivenArrayAssigment33 {
	double sum;

	double sumOfGivenArray(double arr1[]) {
		for (int i = 0; i < arr1.length; i++) {
			sum = sum + arr1[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		double arr[] = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		SumOfGivenArrayAssigment33 sumOfGivenArrayAssigment33 = new SumOfGivenArrayAssigment33();
		double sum = sumOfGivenArrayAssigment33.sumOfGivenArray(arr);
		System.out.print(sum);
	}
}
