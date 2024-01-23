package phenol_verma;

public class DivBy7Or13Reverse {
	void divBy7_13(int firstNum, int lastNum) {
		for (int num = lastNum; num >= firstNum; num--)
			if (num % 13 == 0)
				System.out.println(num + " is divisible by 13");
			else if (num % 7 == 0)
				System.out.println(num + " is divisible by 7");
	}

	public static void main(String[] args) {
		DivBy7Or13Reverse divBy7Or13Reverse = new DivBy7Or13Reverse();
		divBy7Or13Reverse.divBy7_13(7, 39);
	}
}
