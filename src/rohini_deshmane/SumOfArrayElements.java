package rohini_deshmane;

public class SumOfArrayElements {

	void sumOfElements(double[] arr) {
		double sum=0;
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		System.out.println("Sum of Array Elements  = "+sum);
	}
	public static void main(String[] args) {
		SumOfArrayElements sumofElement = new SumOfArrayElements();
		double[] arr = {10.20, 45.50, 34.65, 20.60, 25.46, 78.90};
		sumofElement.sumOfElements(arr);
	}
}
