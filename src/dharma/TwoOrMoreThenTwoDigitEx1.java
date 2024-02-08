package dharma;

public class TwoOrMoreThenTwoDigitEx1 {

	boolean isAtleast2Digit(String name) {
		int count = 0;
		for(int index=0;index<name.length();index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch) == true)
				count++;
		}
		if(count>=2)
			return true;
		return false;
	}
	
	void printNames(String[] names) {
		for(int index=0;index<names.length;index++) {
			if(isAtleast2Digit(names[index]) == true) {
				System.out.println(names[index]);
			}
		}
	}
	public static void main(String[] args) {
		String[] names = {"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"};
		new TwoOrMoreThenTwoDigitEx1().printNames(names);
	}
}
