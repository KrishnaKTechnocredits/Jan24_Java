package aanand;
public class Assignment79 {

	static void pattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("======================================");
	}

	static void StarHashPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0)
					System.out.print("# ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("======================================");
	}

	public static void main(String[] args) {
		pattern();
		StarHashPattern();
	}
}