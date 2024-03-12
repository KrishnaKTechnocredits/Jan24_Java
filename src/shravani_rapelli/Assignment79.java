package shravani_rapelli;

public class Assignment79 {

	void numberPatternPriting2() {
		int temp=4;
		for(int i=1; i<=temp; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	void starPatternPriting2() {
		int temp=5;
		for(int i=1; i<=temp; i++) {
			for(int j=1; j<=i; j++) {
				if(i%2 == 0) {
					System.out.print("#" +" ");
				}else {
					System.out.print("*"+" ");
				}
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		Assignment79 assgn79 = new Assignment79();
		assgn79.numberPatternPriting2();
		System.out.println("\n");
		assgn79.starPatternPriting2();
	}
}
