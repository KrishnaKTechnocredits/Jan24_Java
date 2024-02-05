/*Assignment - 33 : 4th Feb'2024

Return the sum of all given array of double type.

input :{10.20, 45.50, 34.65, 20.60, 25.46, 78.90}
Output : 215.31*/
package sveta;
class Assignment_33_SumOfDouble{
	
	public void sumOfDoubleArray(double[] arr) {
		double sum =0;
	 	for(int index = 0;index<arr.length;index++){
	 		sum+=arr[index];
	 	}
	 	System.out.println(sum);
	}
	
	public static void main(String []args) {
		double[] arr = {10.20, 45.50, 34.65, 20.60, 25.46, 78.90};
		new Assignment_33_SumOfDouble().sumOfDoubleArray(arr);
	}
}
