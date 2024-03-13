/*Assignment78_1:
Pattern printing:
	*
	**
	***
	****
*/
package madhura_kulkarni;

import java.util.Scanner;

public class Assignment78 {
	void printPattern1(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	void printPattern2(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	void printPattern3(int rows) {
		int count = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment78 pr = new Assignment78();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows for pattern 1 : ");
		int row = sc.nextInt();
		pr.printPattern1(row);
		System.out.println("Enter rows for pattern 2: ");
		int input = sc.nextInt();
		pr.printPattern2(input);
		System.out.println("Enter rows for pattern 3: ");
		int rn = sc.nextInt();
		pr.printPattern3(rn);
		sc.close();
	}
}
