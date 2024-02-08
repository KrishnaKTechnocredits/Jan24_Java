/*
 Assignment - 33.2 : 4th Feb'2024
PhenolV_Assignment_39
Return the positive difference between even number sum and odd number sum.
input : {30, 24, 19, 13, 36, 51, 11, 72}
Output : 162 - 94 = 68

evenNum= 30+24+36+72 =162
Odd= 19+13+51+11 = 94 
*/

package phenol_verma;

public class ArrDiffPosNegNum {
	void diffEvenOdd(int arr[]) {
		int diffEvenOdd = 0;
		int sumEven = 0;
		int sumOdd = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0)
				sumEven = sumEven + arr[index];
			else
				sumOdd = sumOdd + arr[index];
		}
		System.out.println("Sum of Even Number - " + sumEven);
		System.out.println("Sum of odd number - " + sumOdd);
		diffEvenOdd = sumEven - sumOdd;
		System.out.println("Difference between even and odd num - " + diffEvenOdd);
	}

	public static void main(String[] args) {
		ArrDiffPosNegNum arrDiffPosNegNum = new ArrDiffPosNegNum();
		int arr[] = { 30, 24, 19, 13, 36, 51, 11, 72 };
		arrDiffPosNegNum.diffEvenOdd(arr);
	}
}
