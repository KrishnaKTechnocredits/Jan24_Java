package hiral_purohit;
/*Assignment - 90 : 25th March'2024 [30 mins]
Code to find max consecutive 1’s in an array [0,0,1,0,0,1,1,0,1,1,1,0]
output : 3*/

public class Assignment_90 {

	int toGetMostConsequentOne(int[] arr, int n) {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count = 0;
			} else {
				count++;
				if (maxCount < count) {
					maxCount = count;
				}
			}
		}
		return maxCount;
	}

	public static void main(String[] args) {
		int[] input = { 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0 };
		int max = new Assignment_90().toGetMostConsequentOne(input, 1);
		System.out.println("most Consequent 1 comes for " + max + " times");
	}

}
