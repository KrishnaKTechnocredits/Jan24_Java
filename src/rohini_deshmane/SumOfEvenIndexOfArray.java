package rohini_deshmane;
/*
 * Assignment - 35 : 4th Feb'2024

Return the sum of even index number from the array

input : {3, 6, 9, 11, 15, 20, 4, 26}
Output : 56

hint 6, 20, 4, 26
 */
public class SumOfEvenIndexOfArray {
	
	void printSum(int[] arr) {
		int sum=0;
		for(int i=0; i< arr.length; i++) {
			if(arr[i]%2==0)
				sum=sum+arr[i];
		}
		System.out.println("Sum of event index numbers = "+sum);
	}

	public static void main(String[] args) {
		SumOfEvenIndexOfArray sumOfNum = new SumOfEvenIndexOfArray();
		int[] arr = {3, 6, 9, 11, 15, 20, 4, 26};
		sumOfNum.printSum(arr);
	}
}
