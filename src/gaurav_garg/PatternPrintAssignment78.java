/*
 Pattern -: 
*
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
7 8 9 10
 */

package gaurav_garg;

public class PatternPrintAssignment78 {
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
