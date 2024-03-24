package rohini_deshmane.array_programs;

import java.util.Arrays;

/*
 Assignment - 91 : 25th March'2024 [45 mins]
1.Shift all the zeros at the end of array.
input : [1,0,0,12,63,4,0,0,5,6,7]
output : [1,12,16,4,5,6,7,0,0,0,0]

2.Shift all the zeros at the begining of array.
input : [1,0,0,12,63,4,0,0,5,6,7]
output : [0,0,0,0,1,12,16,4,5,6,7]

 */
public class AllZerosAtEnd {

	void putAllZerosAtStart(int[] arr) {
		String str="";
		String zeroStr="";
		for(int i=0; i<arr.length; i++) {
			if(arr[i] !=0) {
				str=str+" "+arr[i];
			} else {
				zeroStr = zeroStr+" "+arr[i];
			}
		}
		String finalStr = zeroStr+str;
		String[] arrStr = finalStr.trim().split(" ");
		
		System.out.println(Arrays.toString(arrStr));
	}
	
	void putAllZerosAtEnd(int[] arr) {
		String str="";
		String zeroStr="";
		for(int i=0; i<arr.length; i++) {
			if(arr[i] !=0) {
				str=str+" "+arr[i];
			} else {
				zeroStr = zeroStr+" "+arr[i];
			}
		}
		String finalStr = str+zeroStr;
		String[] arrStr = finalStr.trim().split(" ");
		
		System.out.println(Arrays.toString(arrStr));
	}
	
	public static void main(String[] args) {
		AllZerosAtEnd allZerosAtEnd = new AllZerosAtEnd();
		int[] arr = {1,0,0,12,63,4,0,0,5,6,7};
		System.out.println("Original Array = "+Arrays.toString(arr));
		System.out.println("\nAll Zeros at the end of array");
		allZerosAtEnd.putAllZerosAtEnd(arr);
		System.out.println("\nAll Zeros at the begining of array");
		allZerosAtEnd.putAllZerosAtStart(arr);
	}
}
