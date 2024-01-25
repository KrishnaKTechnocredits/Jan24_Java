package suresh;

public class Loops {

	void m1(int num) {
		int count = 0;
		System.out.println("First five even numbers are");
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				count = count + 1;
			}
			if (count == 5)
				break;
		}

	}

	void m2(int a) {
		int count = 0;
		System.out.println("First five even numbers are");
		while (count < 5) {
			if (a % 2 == 0) {
				System.out.println(a);
				count++;
			}
			a++;
		}
	}

	void m3(int b) {
		int count = 0;
		System.out.println("First five even numbers are");
		do {
			if (b % 2 == 0) {
				System.out.println(b);
				count++;
			}
			b++;
		} while (count < 5);
	}

	public static void main(String[] args) {
		Loops loops = new Loops();
		loops.m1(10);
		loops.m2(0);
		loops.m3(0);
	}
}
