package rohini_deshmane;

public class FindMinMaxFromArray {

	int findMaxNumber(int[] arr) {
		int max=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	int findMinNumber(int[] arr) {
		int min =arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		FindMinMaxFromArray minMax = new FindMinMaxFromArray();
		int[] arr = {10,20,50,60,30};
		int min = minMax.findMinNumber(arr);
		int max = minMax.findMaxNumber(arr);
		System.out.println("Minimum Number = "+min);
		System.out.println("Maximum Number = "+max);
	}
}
