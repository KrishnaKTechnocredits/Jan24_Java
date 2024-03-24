package rohini_deshmane.array_programs;
/*
 
Assignment - 90 : 25th March'2024 [30 mins]
Code to find max consecutive 1’s in an array [0,0,1,0,0,1,1,0,1,1,1,0]
output : 3
 */
public class MaxConsecutive1s {
	
	void findMaxConsecutive(int[] arr) {
		int consecutive=0;
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				consecutive++;
				if (max < consecutive) {
					max = consecutive;
				}
			} else {
				consecutive = 0;
			}
		}
		
		System.out.println("Consecutive count = "+max);
	}
	
	public static void main(String[] args) {
		MaxConsecutive1s maxConsecutive1s = new MaxConsecutive1s();
		int[] arr = {0,0,1,0,0,1,1,0,1,1,1,0};
		maxConsecutive1s.findMaxConsecutive(arr);
	}
}
