package shravani_rapelli;

public class Assignment32 {
	
	void reverseOrder(int[] arr) {
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Assignment32 assign32 = new Assignment32();
		int[] input = {10,20,13,27,29,13,6};
		assign32.reverseOrder(input);
	}

}
