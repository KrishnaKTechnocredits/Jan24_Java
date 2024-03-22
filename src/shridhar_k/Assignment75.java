/*
 * Print all the names having length more than 5 characters, must end with 'a' or 'A' and should not have any digit.
String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};

output : Samiksha
 */

package shridhar_k;

public class Assignment75 {
	
	void processData(String[] str) {
		for(String num : str) {
			if(!isContainsDigit(num) && num.length() > 5 && (num.charAt(num.length()-1) == 'a' || num.charAt(num.length()-1) == 'A')) {
				System.out.println(num);
			} 
		}
	}
	
	private boolean isContainsDigit(String str) {
		boolean flag = false;
		for(int i = 0 ;i < str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				return true;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};
		new Assignment75().processData(names);
	}
}
