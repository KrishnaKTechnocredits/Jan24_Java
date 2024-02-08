package garima_s;

public class ArrayMoreThan2Digit {
	boolean isAtLeast2Digit(String name) {
		int count=0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch) == true)
				count++;
		}
		if(count>=2) 
			return true;
		return false;
	}

	void printNames(String[] names) {
		for (int index = 0; index < names.length; index++) {
			if (isAtLeast2Digit(names[index]) == true) {
				System.out.println(names[index]);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		new ArrayMoreThan2Digit().printNames(names);
	}

}
