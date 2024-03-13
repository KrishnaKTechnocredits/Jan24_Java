/* *
**
***
****

1
1 2
1 2 3 
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

1
2 3
4 5 6
7 8 9 10*/
package rupali_umagol;

public class Assignment78 {

	void patternStar() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	void patternOneToSix() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	void patternOneToSixSingle() {
		int count = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment78 assignment78 = new Assignment78();
		assignment78.patternStar();
		assignment78.patternOneToSix();
		assignment78.patternOneToSixSingle();
	}
}
