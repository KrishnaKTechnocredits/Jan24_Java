package akshay_gaikwad;

public class StartWithVowAndHaveDigit {
	void printStringStartWithVowAndHaveDigit(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			if(isStartWithVowel(str) && isStrHavingDigit(str)) {
				System.out.println(str);
			}
		}
	}
	
	boolean isStartWithVowel(String str) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				flag = true;
				return flag;
			}
		}
		return flag;
	}
	
	boolean isStrHavingDigit(String str) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				flag = true;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		String[] arr = {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"};
		new StartWithVowAndHaveDigit().printStringStartWithVowAndHaveDigit(arr);
	}
}
