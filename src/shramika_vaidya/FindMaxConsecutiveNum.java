package shramika_vaidya;

public class FindMaxConsecutiveNum {

	void getMaxConsecutive1(int[] arr, int targetnum) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == targetnum) {
				count++;
				if (max < count)
					max = count;
			} else
				count = 0;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0 };
		new FindMaxConsecutiveNum().getMaxConsecutive1(arr, 1);
	}
}
