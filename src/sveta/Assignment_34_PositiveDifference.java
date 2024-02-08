/*Assignment - 34 : 4th Feb'2024

Return the positive difference between even number sum and odd number sum.

input : {30, 24, 19, 13, 36, 51, 11, 72}
Output : 162 - 94 = 68

evenNum= 30+24+36+72 =162
Odd= 19+13+51+11 = 94 */

package sveta;

public class Assignment_34_PositiveDifference {

	public static void sumOperation(int[] arr) {
		int sumOfEven=0,sumOfOdd=0;
		char ch = ' ';
		for(int i=0;i<arr.length;i++) {
			if(arr[i] %2==0)
				sumOfEven +=arr[i];
			else 
				sumOfOdd+=arr[i];
		}
		System.out.println("sub of Odd no is "+sumOfOdd );
		System.out.println("sub of Even no is "+sumOfEven );
		if(sumOfOdd<sumOfEven) {
			System.out.println("Positive difference between odd and even no is : " + sumOfEven +  " - " + sumOfOdd + " -> "+(sumOfEven-sumOfOdd));
		}else {
			System.out.println(sumOfOdd-sumOfEven);
		}
	}
	public static void main(String[] args) {
		int[] arr = {30, 24, 19, 13, 36, 51, 11, 72};
		sumOperation(arr);
	}
}
