package madhura_kulkarni;

public class NumDivAssignment21 {

	public static void main(String[] args) {
		int num;
		NumDivAssignment21 ass = new NumDivAssignment21();
		num = ass.numdiv(1);
		System.out.println("Minimum numbers required for the sum of 150 and divisible by 6 are " + num);
	}

	int numdiv(int num) {
		int sum = 0, count = 0;
		while (sum <= 150) {
			if (num % 6 == 0) {
				count++;
				sum = sum + num;
			}
			num++;
		}
		return count;
	}

}
