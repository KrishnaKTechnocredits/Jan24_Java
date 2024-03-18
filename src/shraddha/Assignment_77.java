package shraddha;

public class Assignment_77 {
	void firstMissingNum(int[] arr) {
		for (int i = 1; i <= 10; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("first missing number : " + i);
				break;
			}
		}
	}

	void lastMissingNum(int[] arr) {
		for (int i = 10; i >= 1; i--) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Last missing number : " + i);
				break;
			}
		}
	}
			

	public static void main(String[] args) {
		Assignment_77 assignment_77 = new Assignment_77();
		int[] arr = { 2, 4, 1, 5, 6, 9, 8, 10 };
		assignment_77.firstMissingNum(arr);
		assignment_77.lastMissingNum(arr);
	}
}
