package shravani_rapelli;

public class Assignment38 {
	
	int findMaxNum(int[] arr) {
		int max=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	int findMinNum(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min=arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		Assignment38 assign38 = new Assignment38();
		int[] arr = {10,20,50,60,30};
		int max = assign38.findMaxNum(arr);
		int min = assign38.findMinNum(arr);
		System.out.println("Maximum Number " + max);
		System.out.println("Minimum Number " + min);
	}
}
