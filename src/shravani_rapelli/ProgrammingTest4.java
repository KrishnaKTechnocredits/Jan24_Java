package shravani_rapelli;
import java.util.Arrays;

public class ProgrammingTest4 {

	void divideArrayAndSum(int arr[]) {
		int arr1[] = new int[arr.length/2];
		int arr2[] = new int[arr.length/2];
		int output[]= new int[arr1.length];
		int cnt=0;
		for(int i=0;i<arr.length/2;i++) {
			arr1[i]=arr[i];
		}
		for(int i=(arr.length)/2;i<arr.length;i++) {
			arr2[cnt]=arr[i];
			cnt++;
		}
		for(int i=0;i<output.length;i++) {
			output[i]=arr1[i]+arr2[i];
		}
		System.out.println("Arr1 : "+Arrays.toString(arr1));
		System.out.println("Arr2 : "+Arrays.toString(arr2));
		System.out.println("Sum of Elements in array : "+Arrays.toString(output));
	 }
	
	public static void main(String[] args) {
		ProgrammingTest4 progmng = new ProgrammingTest4();
		int[] arr= {1,10,20,12,15,6};
		progmng.divideArrayAndSum(arr);
		
	}
}
