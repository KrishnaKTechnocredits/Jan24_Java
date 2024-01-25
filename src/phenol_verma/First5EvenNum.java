package phenol_verma;

public class First5EvenNum {

	void forLoop(int firstnum, int lastNum) {
		int count = 0;
		for (int i = firstnum; i <= lastNum; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
			if (count == 5)
				break;
		}
	}

	void whileLoop(int firstnum, int lastNum) {
		int count = 0;
		int i = firstnum;
		while (i <= lastNum) {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
			if (count == 5)
				break;
			i++;
		}
	}

	void doWhileLoop(int firstnum, int lastNum) {
		int count = 0;
		int i = firstnum;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
			if (count == 5)
				break;
			i++;
		} while (i <= lastNum);
	}

	public static void main(String[] args) {
		First5EvenNum first5EvenNum = new First5EvenNum();
		System.out.println("*****forLoop*****");
		first5EvenNum.forLoop(10, 100);
		System.out.println("*****whileLoop*****");
		first5EvenNum.whileLoop(10, 100);
		System.out.println("*****doWhileLoop*****");
		first5EvenNum.doWhileLoop(10, 100);
	}
}
