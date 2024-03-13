package phenol_verma;

public class PatternPajamaProgram {
	
	int max = 9;
	void patternPajama() {
		for (int i = 1; i <= 5; i++) {
			for (int a = 1; a <= i; a++) {
				System.out.print("* ");
			}
			for (int b = max; b>1; b--) {
				System.out.print("  ");
			}
			for (int a = 1; a <= i; a++) {
				System.out.print("* ");
			}
			System.out.println();
			max = max - 2;
		}
		
		
	}
	
	public static void main(String[] args) {
		PatternPajamaProgram patternPajamaProgram = new PatternPajamaProgram();
		patternPajamaProgram.patternPajama();
	}

}
