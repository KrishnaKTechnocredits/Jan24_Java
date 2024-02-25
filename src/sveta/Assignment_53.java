/*Assignment - 53 : 11th Feb'2024
Rearrange the numbers in the array, first all negative numbers followed by positive.
int[] arr = {10,-12,6,-3,-33,44,4};
output : [-12,-3,-33,10,6,44,4]	*/
package sveta;

import java.util.Arrays;

public class Assignment_53 {

	public String[] arrangeString(int []arr) {
		String str1="";
		String str2="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) 
				str1+=arr[i]+" ";
			else 
				str2+=arr[i] +" ";
		}
		String str=(str1+str2).trim();
		String strarr[] =str.split(" ");
		return strarr;
	}
	
	public void printString(int[] arr) {
		String str[] = arrangeString(arr);
		System.out.println(Arrays.toString(str));
	}
	
	public static void main(String[] args) {
		int[] arr = {10,-12,6,-3,-33,44,4};
		new Assignment_53().printString(arr);
	}

}
