//Assignment - 33 : 4th Feb'2024

package puja_poreddiwar;

public class SumOfArrayEle {

	double[] arr = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
	double sum = 0;
	double num = 0;

	void pringSumOfArrElement() {
		for (int index = 0; index <= arr.length - 1; index++) {
			num = (double) arr[index];
			sum = sum + num;
		}
		System.out.println("sum of all given array of double type is: " + sum);
	}

	public static void main(String[] args) {
		SumOfArrayEle sumOfArrayEle = new SumOfArrayEle();
		sumOfArrayEle.pringSumOfArrElement();
	}
}
