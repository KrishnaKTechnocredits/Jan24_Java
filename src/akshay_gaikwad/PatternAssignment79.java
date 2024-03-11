package akshay_gaikwad;

public class PatternAssignment79 {

	void printPattern (int row) {
		int count = 1;
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(count + " ");
			}
			System.out.println();
			count++;
		}
	}
	
	void printEvenOddPatter(int row) {
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				if(i % 2 != 0) {
					System.out.print("* ");
				} else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PatternAssignment79 obj = new PatternAssignment79();
		obj.printPattern(4);
		System.out.println("-------------");
		obj.printEvenOddPatter(5);
		System.out.println("-------------");
	}
}
