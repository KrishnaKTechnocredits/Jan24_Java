package samiksha;

public class MissingNumber {

	void getFirstMissingNum(int endR, int[] num) {
		boolean flag = false;
		int temp = 0;
		for (int index = 1; index < endR; index++) {
			flag = false;
			for (int i = 0; i < num.length; i++) {
				if (index == num[i]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				temp = index;
				System.out.println(temp + " is first missing number");
				break;
			}
		}
	}

	void getLastMissingNum(int endR, int[] num) {
		boolean flag = false;
		int temp = 0;
		for (int index = 1; index < endR; index++) {
			flag = false;
			for (int i = 0; i < num.length; i++) {
				if (index == num[i]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				temp = index;
			}
		}
		System.out.println(temp + " is Last missing number");
	}

	void getMissingNum(int endR, int[] num) {
		System.out.println("missing numbers from given array are : ");
		boolean flag = false;
		int temp = 0;
		for (int index = 1; index < endR; index++) {
			flag = false;
			for (int i = 0; i < num.length; i++) {
				if (index == num[i]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				temp = index;
				System.out.println(temp);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 5, 6, 9, 8, 10 };
		MissingNumber num = new MissingNumber();
		num.getFirstMissingNum(10, arr);
		num.getLastMissingNum(10, arr);
		num.getMissingNum(10, arr);
	}
}
