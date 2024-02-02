package ankita_s;

public class DiffBetweenOddAndEven {

	void printDiffBetweenOddAndEven(String str) {
		int sumodd = 0;
		int sumeven = 0;
		{
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				boolean temp = Character.isDigit(ch);
				int temp1 = Character.getNumericValue(ch);
				if (temp == true && temp1 % 2 != 0) {
					sumodd = sumodd + temp1;
				}
				if (temp == true && temp1 % 2 == 0) {
					sumeven = sumeven + temp1;
				}
			}
			System.out.println("Difference between sum of all the odd digits and even digits is :- " + (sumodd - sumeven));
		}
	}

	public static void main(String[] args) {
		DiffBetweenOddAndEven diffBetweenOddAndEven = new DiffBetweenOddAndEven();
		diffBetweenOddAndEven.printDiffBetweenOddAndEven("te3ch4noc7re9d8its");
	}
}
