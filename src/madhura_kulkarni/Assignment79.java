/*Assignment79:
Pattern printing:
	1
	2 2 
	3 3 3 
	4 4 4 4
	and 
	*
	# #
	* * * 
	# # # #
	* * * * *
*/
package madhura_kulkarni;

import java.util.Scanner;

public class Assignment79 {
	void printStarHashPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if (!(i % 2 == 0))
					System.out.print("* ");
				else
					System.out.print("# ");
			}
			System.out.println();
		}
	}

	void printNumberPattern(int rows) {
		int count = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
				count++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment79 pr = new Assignment79();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows for number pattern : ");
		int row = sc.nextInt();
		pr.printNumberPattern(row);
		System.out.println("Enter number of rows for star-hash pattern : ");
		int input = sc.nextInt();
		pr.printStarHashPattern(input);
		sc.close();
	}
}
