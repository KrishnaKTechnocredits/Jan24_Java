/*Assignment - 33 : 4th Feb'2024
Return the sum of all given array of double type.
input :{10.20, 45.50, 34.65, 20.60, 25.46, 78.90}
Output : 215.31 */

package pallavi_raut;

class SumOfAllDoubleTypeNumbers {

	public static void main(String[] args) {
		double[] arr = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		new SumOfAllDoubleTypeNumbers().printSumOfDigits(arr);
	}

	void printSumOfDigits(double[] num) {
		double sum = 0.0;
		for (int index = 0; index < num.length; index++) {
			sum = sum + num[index];
		}
		System.out.println("Sum of all numbers in given array is : " + sum);
	}
}