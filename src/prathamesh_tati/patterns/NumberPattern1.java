//Assignment 78

//1
//1 2
//1 2 3 
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6

package prathamesh_tati.patterns;

public class NumberPattern1 {
	public void pattern() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new NumberPattern1().pattern();
	}
}