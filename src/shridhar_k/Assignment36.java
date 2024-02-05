//Return the sum of even numbers from the array

package shridhar_k;

public class Assignment36 {
	boolean isEven(int integer) {
		if (integer % 2 ==0)
			return true;
		else
			return false;
	}
	
	int getSumOfNum(int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			if(isEven(arr[i]))
				sum = sum + arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 6, 9, 11, 15, 20, 4, 26};
		System.out.println(new Assignment36().getSumOfNum(arr));
	}
}
