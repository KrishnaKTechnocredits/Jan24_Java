package priya_t;

public class FirstFiveEvenNo {

	public void forloop(int Num1, int Num2) {
		System.out.println("The First 5 Even Numbers between 20 & 60 using for loop are:");
		int count = 0;

		for (int i = Num1; i <= Num2; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
			if (count >= 5) {
				break;
			}
       }

	}

	public void whileloop(int Num1, int Num2) {

		System.out.println("The First 5 Even Numbers between 20 & 60 using while loop are:");
		int count = 0;

		int i = Num1;
		while (i <= Num2) {
			if (i % 2 == 0) {
				System.out.println(i);
                count++;

			}

			if (count >= 5) {
    break;

			}
			i++;
		}
	}

	public void dowhileloop(int Num1, int Num2) {

		System.out.println("The First 5 Even Numbers using do while loop are:");
		int i = Num1;
		do {
			if (i % 2 == 0)
				System.out.println(i);
			i++;
		} while (i <= Num2);

	}

	public static void main(String[] args) {
		FirstFiveEvenNo evenno = new FirstFiveEvenNo();
		evenno.forloop(20, 60);
		evenno.whileloop(20, 60);
		evenno.dowhileloop(20, 30);

	}
}
