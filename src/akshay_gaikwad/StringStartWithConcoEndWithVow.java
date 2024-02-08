package akshay_gaikwad;

public class StringStartWithConcoEndWithVow {
	void printStringStartWithConsoEndWithVow(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			if(isEndsWithVowel(str) && isStartsWithConsonant(str)) {
				System.out.println(str);
			}
		}
	}
	
	boolean isEndsWithVowel(String str) {
		boolean flag = false;
		str = str.toLowerCase();
		char ch = str.charAt((str.length())-1);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			flag = true;
			return flag;
		}
		return flag;

	}
	
	boolean isStartsWithConsonant(String str) {
		boolean flag = false;
		str = str.toLowerCase();
		char ch = str.charAt(0);
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
			flag = true;
			return flag;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		String[] arr = {"Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima"};
		new StringStartWithConcoEndWithVow().printStringStartWithConsoEndWithVow(arr);
	}
}
