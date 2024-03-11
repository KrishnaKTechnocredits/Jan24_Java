package sasmita;

public class StarPatternPrint {
	void getStarPtternPrint() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new StarPatternPrint().getStarPtternPrint();

	}

}
