package dharma;

public class Atleast1SpecialCharEx1 {

	boolean checkSpecialChar(String str) {
		for(int index=0;index<str.length();index++){
			char ch = str.charAt(index);
			if(Character.isDigit(ch) != true && Character.isUpperCase(ch) != true && Character.isLowerCase(ch) != true) {
				return true;
			}
		}
		return false;
	}
	
	void printStringSpecialChar(String[] str) {
		for(int index=0;index<str.length;index++) {
			boolean flag = checkSpecialChar(str[index]);
			if(flag == true)
				System.out.println(str[index]);
		}
	}
	
	public static void main(String[] args) {
		String[] str = {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"};
		new Atleast1SpecialCharEx1().printStringSpecialChar(str);
	}
}
