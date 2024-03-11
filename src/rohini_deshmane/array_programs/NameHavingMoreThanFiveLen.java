package rohini_deshmane.array_programs;
/*
 * Assignment - 75 : 7th March'2024 (15-18 mins)

Print all the names having length more than 5 characters, must end with 'a' or 'A' and should not have any digit.
String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};

output : Samiksha 
 */
public class NameHavingMoreThanFiveLen {
	
	void checkLength(String str) {
		boolean isDigit=false;
		if(str.length() > 6) {
			for(int i=0; i<str.length(); i++) {
				if(Character.isDigit(str.charAt(i))) {
					isDigit=true;
					break;
				}
			}
			if(isDigit == false) {
				System.out.println(str);
				isDigit=true;
			}
		}
		
	}
	
	void printNameWithCondition(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			checkLength(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		NameHavingMoreThanFiveLen nam = new NameHavingMoreThanFiveLen();
		String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};
		nam.printNameWithCondition(names);
	}
}
