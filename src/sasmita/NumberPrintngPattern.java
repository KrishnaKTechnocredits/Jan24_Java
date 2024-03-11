package sasmita;

public class NumberPrintngPattern {
	void getNumerPtternPrint() {
		for(int i=1; i<=6;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	
	}

	public static void main(String[] args) {
		new NumberPrintngPattern().getNumerPtternPrint();

	}

}
