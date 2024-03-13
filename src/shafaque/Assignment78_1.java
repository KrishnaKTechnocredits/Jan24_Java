package shafaque;

public class Assignment78_1 {

	void getNumerPtternPrint() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Assignment78_1().getNumerPtternPrint();

	}

}
