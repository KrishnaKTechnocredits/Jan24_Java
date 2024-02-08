package priya_t;

public class Assignment32_ReverseArray {

	void add(int[] num) {
		for (int index = num.length - 1; index >= 0; index--) {
			System.out.println(num[index]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 13, 27, 29, 13, 6 };
		Assignment32_ReverseArray reverseArray = new Assignment32_ReverseArray();
		int temp = 20;
		reverseArray.add(arr);

	}

}
