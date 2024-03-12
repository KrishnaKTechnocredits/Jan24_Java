package shravani_rapelli;

public class Assignment75 {

	boolean isDigitPresent(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
				return true;
		}
		return false;
	}
	
	void CheckLengthGraterThan5(String[] arr) {
		for(String str : arr) {
			char lastChar = str.charAt(str.length()-1);
			boolean flag = isDigitPresent(str);
			if(str.length()>5 &&(lastChar == 'a' || lastChar == 'A') && flag == false)
				System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		Assignment75 assgn75 = new Assignment75();
		String[] names = {"Pooja","Svee2ta","Samiksha","G4arima","Anand","Shridar"};
		assgn75.CheckLengthGraterThan5(names);
	}
}
