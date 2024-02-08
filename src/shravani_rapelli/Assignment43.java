package shravani_rapelli;

public class Assignment43 {

	boolean isSpecialChar(String name) {
		for(int i=0; i<name.length(); i++) {
		if(!Character.isDigit(name.charAt(i)) && !Character.isUpperCase(name.charAt(i)) && !Character.isLowerCase(name.charAt(i)))
			return true;
		}
		return false;
	}
	
	void printArraySpecialChar(String[] inputStr) {
		for(int i=0; i<inputStr.length; i++) {
			if(isSpecialChar(inputStr[i]))
				System.out.println(inputStr[i]);
		}
	}
	
	public static void main(String[] args) {
		Assignment43 assign43 = new Assignment43();
		String[] arr = {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"};
		assign43.printArraySpecialChar(arr);
	}
	
	

}
