package aanand;
public class Assignment78 {

	static void pattern() {
		int count = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
		System.out.println("======================================");
	}

	static void startPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("======================================");
	}

	static void bigPattern() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("======================================");
	}

	public static void main(String[] args) {
		pattern();
		startPattern();
		bigPattern();
	}
}