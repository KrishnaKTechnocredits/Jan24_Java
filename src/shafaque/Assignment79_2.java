package shafaque;

public class Assignment79_2 {

	void getevenoddPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0) {
					System.out.print("*");
				} else {
					System.out.print("#");

				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Assignment79_2().getevenoddPattern();

	}

}
