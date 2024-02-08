package ashwini_b;

/*
 Find out the minimum numbers required to create sum 150, consider only those numbers which is divisible by 6.
output : 7
 */
public class NumDivBy6 {
	void printNumDiv6() {
		int num = 1;
		int count = 0;
		int sum = 0;
		while (sum <= 150) {
			if (num % 6 == 0) {
				sum = sum + num;
				//System.out.println(num);
				count++;
			}
			num++;
		}
		System.out.println("Output : " + count);
		//System.out.println("Sum= " + sum);
	}

	public static void main(String[] args) {
		NumDivBy6 numDivBy6 = new NumDivBy6();
		numDivBy6.printNumDiv6();
	}
}
