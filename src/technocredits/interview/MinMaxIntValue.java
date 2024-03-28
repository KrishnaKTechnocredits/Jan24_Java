package technocredits.interview;

import java.util.Arrays;

public class MinMaxIntValue {
	
	
	int getDigitMul(int digit, int repeat){
		int sum = 1;
		for(int count = 1; count<=repeat;count++){
			sum = sum + digit*digit;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		/*System.out.println(Integer.MIN_VALUE);
		int[] orginalArr = {10,20,30};
		int[] arr  = Arrays.copyOf(orginalArr, orginalArr.length);
		System.out.println(Arrays.toString(arr));
		arr[0] = 100;
		
		System.out.println(orginalArr[0]);
		System.out.println(arr[0]);*/
	}
}
