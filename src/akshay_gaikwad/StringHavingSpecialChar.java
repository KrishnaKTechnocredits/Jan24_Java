package akshay_gaikwad;

public class StringHavingSpecialChar {
	void printStringHavingSpecialChar(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			if(isStringHavingSpecialChar(str)) {
				System.out.println(str);
			}
		}
	}
	
	boolean isStringHavingSpecialChar(String str) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			str = str.toLowerCase();
			char ch = str.charAt(index);
			if (!Character.isDigit(ch) && !Character.isLowerCase(ch)) {
				flag = true;
				return flag;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		String [] arr = {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"};
		new StringHavingSpecialChar().printStringHavingSpecialChar(arr);
	}
}
