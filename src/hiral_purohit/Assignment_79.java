package hiral_purohit;

public class Assignment_79 {

	void toPrintNumPattern(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	void toPrintPttern2(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0) {
					System.out.print('*' + " ");
				} else {
					System.out.print('#' + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment_79 assignment_79 = new Assignment_79();
		assignment_79.toPrintNumPattern(4);
		System.out.println("------------------------------");
		assignment_79.toPrintPttern2(5);
		System.out.println("------------------------------");
	}

}
