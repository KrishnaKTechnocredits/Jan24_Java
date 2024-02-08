package dharma;

public class SumOfDigitEx1 {

	boolean sumDigit(String name) {
		int sum = 0;
		for(int index=0;index<name.length();index++) {
			char ch = name.charAt(index);
			int digit = Character.getNumericValue(ch);
			if(Character.isDigit(ch) == true) {
				sum = sum + digit;
			}
		}
		System.out.println(name + "->" + sum);
		return true;
	}
	
	void printNames(String[] names) {
		for(int index=0;index<names.length;index++) {
			sumDigit(names[index]);
		}
	}
	public static void main(String[] args) {
		String[] names = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		new SumOfDigitEx1().printNames(names);

	}

}
