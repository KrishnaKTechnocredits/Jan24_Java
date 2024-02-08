package sasmita;

public class SsumofDoubleArray {

	void printSumOfDouble(double[] d) {
		double sum = 0;
		for (int index = 0; index < d.length; index++) {
			sum += d[index];
		}
		System.out.println("sum of digit in the gien array : " + sum);
	}

	public static void main(String[] args) {
		double[] d = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		new SsumofDoubleArray().printSumOfDouble(d);
	}
}