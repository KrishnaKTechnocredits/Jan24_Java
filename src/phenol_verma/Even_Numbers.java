package phenol_verma;

public class Even_Numbers {
	void evenNumber(int firstNum, int lastNum) {
		for (int num = firstNum; num <= lastNum; num++) {
			if (num % 2 == 0)
				System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		Even_Numbers even_Numbers = new Even_Numbers();
		even_Numbers.evenNumber(10, 15);
	}
}
