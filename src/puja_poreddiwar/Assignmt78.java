package puja_poreddiwar;

public class Assignmt78 {

	void printPattern1() {
		int num = 4;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	void printPattern2() {
		int num = 6;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}

	void printPattern3() {
		int num = 4;
		int temp = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(temp++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignmt78 pattern1 = new Assignmt78();
		pattern1.printPattern1();
		System.out.println("--------------");
		pattern1.printPattern2();
		System.out.println("--------------");
		pattern1.printPattern3();

	}

}
