/*Assignment - 33 : 4th Feb'2024
Return the sum of all given array of double type.
input :{10.20, 45.50, 34.65, 20.60, 25.46, 78.90}
Output : 215.31
*/

package padmaja;

public class SumOfArrayOfDoubleType {
	
	void printSumOfArray(double[] num) {
		double sum = 0;
		for(int index=0; index<num.length; index++) {
			sum = sum + num[index];
		}
		System.out.println(sum);
	}
 public static void main(String[] arg) {
	 double[] arr ={10.20, 45.50, 34.65, 20.60, 25.46, 78.90};
	 SumOfArrayOfDoubleType array = new SumOfArrayOfDoubleType();
	 array.printSumOfArray(arr);
 }
}
