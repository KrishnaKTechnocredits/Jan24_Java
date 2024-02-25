//Assignment 33
// Return sum of given array of double type

package prathamesh_tati.array;

public class SumOfArray {
	static double sum = 0;

	static double addtionOfArray(double[] arr) {
		for (int index = 0; index < arr.length; index++) {
			sum = sum + arr[index];
		}
		return sum;
	}

	void display(double[] num) {
		addtionOfArray(num);
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfArray sumOfArray = new SumOfArray();
		double[] input = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		sumOfArray.display(input);
	}
}