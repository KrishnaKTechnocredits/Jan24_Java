package atisha;

//return the sum of all given array of double type
 class Assignment33 {
	void printSumOfDouble(double[] arr) {
		double sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum += arr[index];
	
		}
		System.out.println("Sum of digits in given array : " + sum);
	}
	
	public static void main(String[] args) {
		double [] arr = {10.20, 45.50, 34.65, 20.60, 25.46, 78.90};
		new Assignment33().printSumOfDouble(arr);
	}
}
