/*Assignment - 79 : 9th March'2024
PhenolV_Assignment_82
1
22
333
4444

*
##
***
####*/

package phenol_verma;

public class PatterSpecialCharacter {

	void patter1() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	void patter2() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0) {
				System.out.print("*");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatterSpecialCharacter patterSpecialCharacter = new PatterSpecialCharacter();
		System.out.println("Patter - 1");
		patterSpecialCharacter.patter1();

		System.out.println("Patter - 2");
		patterSpecialCharacter.patter2();

	}

}
