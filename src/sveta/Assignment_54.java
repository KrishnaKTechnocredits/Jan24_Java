/*Assignment - 54 : 11th Feb'2024
Push all the zeros at the end of an array.
int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
output : {10,-12,6,-3,-33,44,4,0,0,0};*/
package sveta;
import java.util.Arrays;

public class Assignment_54 {

	public int[] arrangeString(int []arr) {
		int j=0;
		int [] input=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) 
				input[j++]=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) 
				input[j++]=arr[i];
		}
		
		return input;
	}
	
	public void printString(int[] arr) {
		int outputarr[] = arrangeString(arr);
		System.out.println(Arrays.toString(outputarr));
	}
	
	public static void main(String[] args) {
		int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
		new Assignment_54().printString(arr);
	}

}