package dharma;

public class Assignment90 {

	void FindMaxConsecutive(int[] arr) {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
				if (maxCount < count)
					maxCount = count;
			} else {
				count = 0;
			}
		}
		System.out.println(maxCount);
	}

	public static void main(String[] args) {
		Assignment90 ass90 = new Assignment90();
		int[] arr = { 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0 };
		ass90.FindMaxConsecutive(arr);
	}
}
