package akshay_gaikwad;

public class Assignment75 {
	boolean isHaveingDigit(String str) {
		for(int index = 0; index < str.length(); index++) {
			if(Character.isDigit(str.charAt(index))) {
				return true;
			}
		}
		return false;
	}
	
	void printNames(String[] input) {
		for(String str: input) {
			if(str.length()>5 && !isHaveingDigit(str) && (str.charAt(str.length()-1) == 'a' || str.charAt(str.length()-1) == 'A' )){
				System.out.print(str + " ");
			}
		}
	}
	public static void main(String[] args) {
		String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};
		new Assignment75().printNames(names);
	}
}
