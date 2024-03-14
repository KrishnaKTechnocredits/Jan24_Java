package dharma;

import java.util.Arrays;

public class Test_4 {

	void divideOfArr(int[] arr) {
		int[] num1 = new int[arr.length/2];
		int[] num2 = new int[arr.length/2];
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i < num1.length) {
				num1[i] = arr[i];
			}else {
				num2[temp] = arr[i];
				temp++;
			}
		}
		System.out.println("num1 -> "+Arrays.toString(num1));
		System.out.println("num2 -> "+Arrays.toString(num2));
		sumOfArr(num1, num2);
	}
	
	int[] sumOfArr(int[] arr1, int[] arr2){
		int[] output = new int[arr1.length];
		for(int i = 0; i < output.length; i++) {
			output[i] = arr1[i]+arr2[i];
		}
		System.out.println("sum of 2 arr -> "+Arrays.toString(output));
		return output;
	} 

	public static void main(String[] args) {
		int[] num = {1,10,20,12,15,6};
		Test_4 test_4 = new Test_4();
		test_4.divideOfArr(num);
    }
}