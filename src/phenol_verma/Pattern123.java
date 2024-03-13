/*
Assignment - 78 : 9th March'2024
PhenolV_Assignment_79
Pattern - 1

*
**
***
****

Pattern - 2

1
1 2
1 2 3 
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

Pattern - 3

1
2 3
4 5 6
7 8 9 10*/

package phenol_verma;

public class Pattern123 {
	
	public static void main(String[] args) {
		
		System.out.println("Pattern - 1");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*' + " ");
			}
			System.out.println();
		}
		
		System.out.println("Pattern - 2");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("Pattern - 3");
		int count = 1;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
}
