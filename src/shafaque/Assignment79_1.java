package shafaque;

public class Assignment79_1 {

	void pattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Assignment79_1().pattern();

	}

}
