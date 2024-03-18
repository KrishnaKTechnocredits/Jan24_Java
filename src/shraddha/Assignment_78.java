package shraddha;

public class Assignment_78 {

	void printStar() {
		for(int i= 1;i <=4 ; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	void patternNumPattern() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	void printAllNums() {
		int count =0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment_78 assignment_78 = new Assignment_78();
		assignment_78.patternNumPattern();
		assignment_78.printStar();
		assignment_78.printAllNums();
	}
	
}

	