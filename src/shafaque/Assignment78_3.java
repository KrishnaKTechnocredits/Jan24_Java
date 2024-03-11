package shafaque;

public class Assignment78_3 {

	void getStarPtternPrint() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Assignment78_3().getStarPtternPrint();

	}

}
