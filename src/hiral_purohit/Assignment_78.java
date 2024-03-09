package hiral_purohit;

public class Assignment_78 {

	void toGetStarPatternPrinting(char ch) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	void toGetNumberPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	void toGetNumberPyramid(int n) {
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment_78 assignment_78 = new Assignment_78();
		assignment_78.toGetStarPatternPrinting('*');
		System.out.println("---------------------------");
		assignment_78.toGetNumberPattern(6);
		System.out.println("---------------------------");
		assignment_78.toGetNumberPyramid(4);
		System.out.println("---------------------------");
	}

}
