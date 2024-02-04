package samiksha;

public class DiffSum {

	void printSum() {
		String str = "te3ch4noc7re9d8its";
		int sum1 = 0;
		int sum2 = 0;
		int diff = 0;
		for (int num = 0; num <= str.length() - 1; num++) {
			char ch = str.charAt(num);
			boolean flag = (Character.isDigit(ch));
			if (flag == true) {
				int temp = Character.getNumericValue(ch);
				if (temp % 2 == 0) {
					sum1 = sum1 + temp;
				} else
					sum2 = sum2 + temp;
			}
		}if(sum1 > sum2) {
		   diff = sum1 - sum2;
		}else
		   diff = sum2-sum1;
		System.out.println(" diffrence between odd and even digits is " + diff);
	}

	public static void main(String[] args) {
		new DiffSum().printSum();
	}
}
