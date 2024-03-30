package garima_s;

public class Assignment_90 {

	void getConsecutiveOnes(int[] arr) {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
				if (maxCount < count) {
					maxCount = count;
				}
			} else
				count = 0;
		}
		System.out.println("Maximun Number of Consecutive Ones : " + maxCount);
	}

	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0 };
		new Assignment_90().getConsecutiveOnes(arr);
	}
}
