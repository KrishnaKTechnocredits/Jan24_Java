// Return the sum of all given array of double type.

package shridhar_k;

public class Assignment33_IsDouble {

	double getSumOfDouble(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		double[] arr = {10.20, 45.50, 34.65, 20.60, 25.46, 78.90};
		System.out.println(new Assignment33_IsDouble().getSumOfDouble(arr)); 
	}
}
