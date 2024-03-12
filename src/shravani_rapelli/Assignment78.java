package shravani_rapelli;

public class Assignment78 {
	
	void starPrinting() {
		for(int i=1; i<=4; i++) { 
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	void numberPrinting() {
		for(int i=1; i<=6; i++) { 
			for(int j=1; j<=i; j++) {
				System.out.print(j +" ");
			}
		System.out.println();
		}
	}
	
	void numberPatternPriting() {
		int cnt =1;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(cnt+" ");
				cnt++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment78 assgn78 = new Assignment78();
		assgn78.starPrinting();
		System.out.println("\n");
		assgn78.numberPrinting();
		System.out.println("\n");
		assgn78.numberPatternPriting();
	}

}
