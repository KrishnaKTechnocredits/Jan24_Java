/*Print all the names having length more than 5 characters, must end with 'a' or 'A' and should not have any digit.
String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};

output : Samiksha */

package akshay_gaikwad;

public class EnhacementForLoop {
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
		new EnhacementForLoop().printNames(names);
	}
}
