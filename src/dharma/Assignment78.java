package dharma;

public class Assignment78 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			int m=0;
			for (int j = 0; j <= i; j++) {

				System.out.print(++m + " ");
			}
			System.out.println();
		}
		System.out.println();
		int m=0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(++m + " ");
			}
			System.out.println();
		}
	}	
}




		
	     