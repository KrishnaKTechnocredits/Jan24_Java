//Assignment 79
//1 
//2 2 
//3 3 3 
//4 4 4 4 

package prathamesh_tati.array;

public class NumberPattern3 {
	public void pattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new NumberPattern3().pattern();
	}
}
