//Assignment 78

//* 
//* * 
//* * * 
//* * * * 

package prathamesh_tati.patterns;

public class StarPattern1 {
	public void pattern() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new StarPattern1().pattern();
	}
}
