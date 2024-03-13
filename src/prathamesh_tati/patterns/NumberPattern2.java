//Assignment 78

//1
//2 3
//4 5 6
//7 8 9 10
package prathamesh_tati.patterns;

public class NumberPattern2 {
	public void pattern() {
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
		new NumberPattern2().pattern();
	}
}