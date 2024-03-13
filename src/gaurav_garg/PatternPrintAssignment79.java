/*
1
22
333
4444

*
##
***
####
*****
 */
package gaurav_garg;

public class PatternPrintAssignment79 {

	public static void main(String[] args) {
		int k = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(k);
			}
			System.out.println();
			k = k + 1;
		}

		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				if (i % 2 == 0)
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
}
