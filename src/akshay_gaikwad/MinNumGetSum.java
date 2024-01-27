package akshay_gaikwad;

public class MinNumGetSum {
	
	void minNumGetSum(int input) {
		int count = 0;
		int sum = 0;
		int num = 1;
		while(sum < input) {
			if (num % 6 == 0) {
				sum += num;
				count++;
			}
			num++;
		}
		System.out.println("Minimun Numbers required to get sum " + input + " which are divisble by 6 are : " + count);
	}
	public static void main(String[] args) {
		MinNumGetSum minnumgetsum = new MinNumGetSum();
		minnumgetsum.minNumGetSum(150);
	}
}
