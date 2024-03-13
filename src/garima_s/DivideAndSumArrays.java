package garima_s;

import java.util.Arrays;

public class DivideAndSumArrays {
	 void divideArray(int[] arr) {
		int[] num1=new int[arr.length/2];
		int[] num2= new int[arr.length/2];
		int[] output= new int[arr.length/2];
		int count=0;
		for(int i=0;i<arr.length/2;i++) {
			num1[i]=arr[i];
		}
		for(int i=(arr.length)/2;i<arr.length;i++) {
			num2[count]=arr[i];
			count++;
		}
		for(int i=0;i<output.length;i++) {
			output[i]=num1[i]+num2[i];
		}
		System.out.println("Num1 : "+Arrays.toString(num1));
		System.out.println("Num2 : "+Arrays.toString(num2));
		System.out.println("Sum of Arrays : "+Arrays.toString(output));
	 }
	
	public static void main(String[] args) {
		int[] arr= {1,10,20,12,15,6};
		new DivideAndSumArrays().divideArray(arr);
	}
}
