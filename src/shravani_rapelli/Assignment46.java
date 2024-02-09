package shravani_rapelli;

public class Assignment46 {
	
	void getRearrangedString(String[] arr) {
		String Digit = "";
		String UpperCase = "";
		String LowerCase = "";
		for(int i=0; i<arr.length; i++) {
			String str = arr[i];
			for(int index=0; index<str.length(); index++){
				char ch = str.charAt(index);
				if(Character.isDigit(ch))
					Digit = Digit + ch;
				else if(Character.isUpperCase(ch))
					UpperCase = UpperCase + ch;
				else if(Character.isLowerCase(ch))
					LowerCase = LowerCase + ch;
			}
			String NewString = Digit + UpperCase + LowerCase;
			System.out.println(NewString);
		}
	}
	
	public static void main(String[] args) {
		Assignment46 assign46 = new Assignment46();
		String[] arr = {"AasH3v7i"};
		assign46.getRearrangedString(arr);
	}
}
