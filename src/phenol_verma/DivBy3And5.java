package phenol_verma;

public class DivBy3And5 {
	void numberRange(int firstNum, int lastNum) {
		for (int num = firstNum; num <= lastNum; num++) {
			if (num % 3 == 0 && num % 5 == 0)
				System.out.println(num);
		}
	}

	public static void main(String[] args) {
		DivBy3And5 divBy3And5 = new DivBy3And5();
		divBy3And5.numberRange(5, 30);
	}
}
