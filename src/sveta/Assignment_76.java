/*Assignment - 76 : 7th March'2024
- create array with max number
- create array with min number
- Create new array with elements of both array (lenght1 + length2) [union of arrays]
- add array element (index to index) and sort*/
package sveta;
import java.util.Arrays;
public class Assignment_76 {

	void minNoArray(int arr1[], int arr2[]) {
		int[] minArr = new int[arr1.length];
		for(int i=0;i<minArr.length;i++) {
			if(arr1[i]>arr2[i]) {
				minArr[i]=arr2[i];
			}else {
				minArr[i]=arr1[i];
			}
		}
		System.out.println("Min Array is ->"+Arrays.toString(minArr));		
	}
	
	void maxNoArray(int arr1[], int arr2[]) {
		int[] maxArr = new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]<arr2[i]) {
				maxArr[i]=arr2[i];
			}
			else {
				maxArr[i]=arr1[i];
			}
		}
		System.out.println("Max Array is ->"+Arrays.toString(maxArr));
	}
	
	void unionArray(int[]arr1, int[] arr2) {
		int temp=0;
		int[] output=new int[(arr1.length+arr2.length)];
		for(int i=0;i<output.length;i++) {
			if(i<arr1.length) {
				output[i]=arr1[i];
				
			}else {
				output[i]=arr2[temp];
				temp++;
			}
		}
		System.out.println("Union of Arrays is ->"+Arrays.toString(output));
	}
	
	void sumOfElementOfArray(int[]arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for(int i=0;i<output.length;i++) {
			output[i]=arr1[i]+arr2[i];
		}
		System.out.println("sum of Arrays is ->"+Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		int arr[] = {23, 34, 46, 67, 87};
		int arr2[]= {65, 43, 78, 45, 90};
		Assignment_76 ass = new Assignment_76();
		ass.maxNoArray(arr,arr2);
		ass.minNoArray(arr, arr2);
		ass.unionArray(arr, arr2);
		ass.sumOfElementOfArray(arr, arr2);
	}

}
