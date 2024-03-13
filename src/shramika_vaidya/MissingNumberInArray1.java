package shramika_vaidya;

public class MissingNumberInArray1 {

	void firstMissingNum(int[] arr1) {
		boolean flag = false;
		for (int num = 1; num <= 10; num++) {
			flag = false;
			for (int arrNum : arr1) {
				if (num == arrNum) {
					flag = true;
				}
			}
			if (flag == false) {
				System.out.println("First missing num is->" + num);
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 5, 6, 9, 8, 10 };
		MissingNumberInArray1 missingNumberInArray1 = new MissingNumberInArray1();
		missingNumberInArray1.firstMissingNum(arr);
	}
}
