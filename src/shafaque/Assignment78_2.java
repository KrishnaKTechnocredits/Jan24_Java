package shafaque;

public class Assignment78_2 {

	void getpyramidPtternPrint() {
		int count = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Assignment78_2().getpyramidPtternPrint();

	}

}
