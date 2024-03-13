package dharma;

public class Assignment75 {

	boolean isDigit(String str) {
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch) == true) {
				return true;
			}
		}
		return false;
	}
	
	void processData(String[] arr) {
		String names = "";
		for(String name : arr) {
			char lastChar = name.charAt(name.length()-1);
			boolean flagisDigit = isDigit(name);
			if(name.length() > 5 && (lastChar == 'a' || lastChar == 'A') && !flagisDigit) {
				names = name;
				System.out.println(names);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};
		new Assignment75().processData(names);
	}
}
