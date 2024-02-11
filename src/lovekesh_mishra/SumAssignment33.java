package lovekesh_mishra;

class SumAssignment33 {

	double sumOfAll(double[] num) {
		double sum = 0;
		for (int i = 0; i <= num.length - 1; i++) {
			sum = sum + num[i];

		}
		return sum;
	}

	public static void main(String[] args) {
		SumAssignment33 ans = new SumAssignment33();
		double[] arr = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		double sum = ans.sumOfAll(arr);
		System.out.println(sum);
	}
}
