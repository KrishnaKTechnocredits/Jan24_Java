package nikita_patil;
import java.util.Arrays;

public class Assignment76 {
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
		// TODO Auto-generated method stub

		int arr[] = {23, 34, 46, 67, 87};
		int arr2[]= {65, 43, 78, 45, 90};
		Assignment76 a = new Assignment76();
		a.maxNoArray(arr,arr2);
		a.minNoArray(arr, arr2);
		a.unionArray(arr, arr2);
		a.sumOfElementOfArray(arr, arr2);
	}


}
