/*
Assignment - 33.1 : 4th Feb'2024
PhenolV_Assignment_38
Return the sum of all given array of double type.
input :{10.20, 45.50, 34.65, 20.60, 25.46, 78.90}
Output : 215.31 */

package phenol_verma;

public class ArrSumAllDbl {
	void sumAllDblNum(double[] arr) {
		double sumDbl = 0.0;
		for (int index = 0; index < arr.length; index++) {
			sumDbl = sumDbl + arr[index];
		}
		System.out.println("Sum of array element - " + sumDbl);
	}

	public static void main(String[] args) {
		ArrSumAllDbl arrSumAllDbl = new ArrSumAllDbl();
		double arr[] = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		arrSumAllDbl.sumAllDblNum(arr);
	}
}
