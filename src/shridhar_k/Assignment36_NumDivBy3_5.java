//Return the sum of all the numbers which are divisible by 3 or 5.
package shridhar_k;

public class Assignment36_NumDivBy3_5 {
	
	boolean isNumdivBy3_5(int num){
		if (num % 3 == 0 || num % 5 == 0)
			return true;
		else
			return false;
	}
	
	int getSumOfNum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(isNumdivBy3_5(arr[i])) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = {6, 5, 3, 15, 19, 40, 30, 27, 11};
		System.out.println(new Assignment36_NumDivBy3_5().getSumOfNum(arr));
	}
}
