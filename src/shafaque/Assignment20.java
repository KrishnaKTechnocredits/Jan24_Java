package shafaque;

public class Assignment20 {
	void forloop(int num1, int num2) {
		for (int i = num1; i <= num2; i++)
			if (i % 2 == 0)
				System.out.println(i);
	}

	void whileloop(int num1, int num2) {
		int i = num1;
		while (i <= num2) {
			if (i % 2 == 0)
				System.out.println(i);
			i++;
		}
	}

	void doWhileloop(int num1, int num2) {
		int i = num1;
		do {
             if (i % 2 == 0)
				System.out.println(i);
			i++;
		}
		while (i <= num2);
	}

	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		System.out.println("For loop");
		assignment20.forloop(10, 20);
		System.out.println("While loop");
		assignment20.whileloop(10, 20);
		System.out.println("Do While loop");
		assignment20.doWhileloop(10, 20);
	}

}