package varsha.AssignmentOn4;

//Print all the names from given array having atleast one special character.
//
//input : {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"}
//output : Aaka$nsha
//     Aas-hvi
//     Var#s-ha

public class ArrayEx12 {

	void printString(String input) {
		String name = "";
		for (int i = 0; i < input.length(); i++) {
			String str = input.toLowerCase();
			char ch = str.charAt(i);
			if (!Character.isUpperCase(ch) && !Character.isDigit(ch) && !Character.isLowerCase(ch)) {
				name = input;
			}
		}
		if (name != "")
			System.out.println(name);
	}

	public static void main(String[] args) {
		String[] str = { "Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		for (int i = 0; i < str.length; i++) {
			String input = str[i];
			new ArrayEx12().printString(input);
		}
	}

}
