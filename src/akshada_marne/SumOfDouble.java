package akshada_marne;

public class SumOfDouble {
	void sum(double[] num) {
		double sum=0;
			for (int i=0; i<num.length; i++) {
				sum=sum+num[i];
			}
			System.out.println(sum);

		}

		public static void main(String args[]) {
			SumOfDouble sumOfDouble = new SumOfDouble();

			double[] arr = {10.20, 45.50, 34.65, 20.60, 25.46, 78.90};
			sumOfDouble.sum(arr);
		}

}
