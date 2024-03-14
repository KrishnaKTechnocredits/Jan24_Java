package puja_poreddiwar;

public class Assignmt79PatternPrint2 {

	void printPattern1() {
		int num = 4;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
	}

	void printPattern2() {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print("#" + " ");
				} else {
					System.out.print("*" + " ");
				}
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Assignmt79PatternPrint2 pattern = new Assignmt79PatternPrint2();
		pattern.printPattern1();
		System.out.println("-------------");
		pattern.printPattern2();

	}

}
