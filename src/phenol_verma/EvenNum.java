
package phenol_verma;

class EvenNum {
	void forLoop(int firstnum, int lastNum) {
		for (int i = firstnum; i <= lastNum; i++)
			if (i % 2 == 0)
				System.out.println(i);
	}

	void whileLoop(int firstnum, int lastNum) {
		int i = firstnum;
		while (i <= lastNum) {
			if (i % 2 == 0)
				System.out.println(i);
			i++;
		}
	}

	void doWhileLoop(int firstnum, int lastNum){
		int i = firstnum;
		do {
			if (i %2 == 0)
				System.out.println(i);
			i++;
			} while (i <= lastNum); 
	
	}

	public static void main(String[] args) {
		EvenNum evenNum = new EvenNum();
		System.out.println("*****forLoop*****");
		evenNum.forLoop(10, 20);
		System.out.println("*****whileLoop*****");
		evenNum.whileLoop(10, 20);
		System.out.println("*****doWhileLoop*****");
		evenNum.doWhileLoop(10, 20);
	}
}