/*Assignment - 33 : 4th Feb'2024

Return the sum of all given array of double type.

input :{10.20, 45.50, 34.65, 20.60, 25.46, 78.90}
Output : 215.31*/
package sarang_kulkarni;

public class SumOfAllDoubleArrElements {
	static double sum=0;
	void sumdoublearr(double[] num) {
		for(int i=num.length-1;i>=0;i--) {
			sum=sum +num[i];
		}
	}
	
	public static void main(String[] args) {
		double [] arr= {10.20, 45.50, 34.65, 20.60, 25.46, 78.90};
		SumOfAllDoubleArrElements doublesum  = new SumOfAllDoubleArrElements();
		doublesum.sumdoublearr(arr);
		System.out.println("Sum="+sum);
	}

}
