package shafaque;

public class Assignment96 {

	void printFibonociseriousForNthElement(int n) {
		int a = 0;
		int b = 1;
		System.out.print("Print the Fibonocci serios -: ");
		System.out.print(a + "," + b);
		for (int j = 3; j <= n; j++) {
			int c = a + b;
			System.out.print("," + c);
			a = b;
			b = c;
		}
	}

	void printFibonociseriousWhichNotCrossed(int n) {
		int a = 0;
		int b = 1;
		System.out.println();
		System.out.print("Print the Fibonocci serios which should be less than " + n + "  -: ");
		System.out.print(a + "," + b);
		int c = a + b;
		while (c <= n) {
			c = a + b;
			a = b;
			b = c;
			if (c > n) {
				break;
			}
			System.out.print("," + c);
		}
	}

	void printFibonociseriousWhichBetweenCrossed(int h, int n) {
		int a = 0;
		int b = 1;
		System.out.println();
		System.out.print("Print the Fibonocci serios which should be between than " + h + " and " + n + " -: ");
		int c = a + b;
		if (h == 1) {
			System.out.print(a + " " + b + " " + b);
		}
		while (c <= n) {
			c = a + b;
			a = b;
			b = c;

			if (c > h && c < n) {
				System.out.print(" " + c);
			}

		}
	}

	public static void main(String[] args) {
		new Assignment96().printFibonociseriousForNthElement(10);
		new Assignment96().printFibonociseriousWhichNotCrossed(100);
		new Assignment96().printFibonociseriousWhichBetweenCrossed(50, 100);
	}
}
