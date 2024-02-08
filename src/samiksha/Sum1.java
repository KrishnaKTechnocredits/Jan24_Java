package samiksha;
// sum= 150 div by 6 

public class Sum1 {

	void printMinNo() {
		int sum = 0;
		int count = 0;
		int num = 1;
		while (sum <= 150) {
			if (num % 6 == 0) {
				sum = sum + num;
				count++;
			}
			num++;
		}
		System.out.println("Output is " + count);
	}

	public static void main(String[] args) {
		Sum1 sum = new Sum1();
		sum.printMinNo();
	}
}
