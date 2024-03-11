package ankita_s;

public class Assignment77 {

	void firstMissingNum(int[] input) {
		for (int i = 1; i <= 10; i++) {
			boolean flag = false;
			for (int j = 0; j < input.length; j++) {
				if (input[j] == i) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("First Missing Number : " + i);
				break;
			}
		}
	}

	void lastMissingNum(int[] input) {
		for (int i = 10; i >= 1; i--) {
			boolean flag = false;
			for (int j = input.length - 1; j >= 0; j--) {
				if (input[j] == i) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Last Missing Number : " + i);
				break;
			}
		}
	}

	void allMissingNum(int[] input) {
		for (int i = 1; i <= 10; i++) {
			boolean flag = false;
			for (int j = 0; j < input.length; j++) {
				if (input[j] == i) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] x = { 2, 4, 1, 5, 6, 9, 8, 10 };
		Assignment77 ass77 = new Assignment77();
		ass77.firstMissingNum(x);
		ass77.lastMissingNum(x);
		System.out.print("All Missing Numbers : ");
		ass77.allMissingNum(x);
	}
}
