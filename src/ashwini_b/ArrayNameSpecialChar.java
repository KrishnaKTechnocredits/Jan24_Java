package ashwini_b;
/*
Assignment - 43 : 4th Feb'2024
Print all the names from given array having atleast one special character.
input : {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"}
output : Aaka$nsha
         Aas-hvi
         Var#s-ha
 */
public class ArrayNameSpecialChar {

	void printspecialCharName(String[] name) {
		for(int i = 0 ; i < name.length ; i++) {
			String str = name[i];
			//System.out.println(str);
			for(int j = 0 ; j<str.length(); j++) {
				char ch = str.charAt(j);
				if(!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
					System.out.println(str);
					
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		String[] inputarr = {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"};
		ArrayNameSpecialChar arrayNameSpecialChar = new ArrayNameSpecialChar();
		arrayNameSpecialChar.printspecialCharName(inputarr);

	}

}
