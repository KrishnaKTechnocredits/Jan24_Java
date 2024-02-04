package rohit_sutar;

public class LastConsonantFromString{
	
	void printLastConsonant(String strInput){
		
		strInput = strInput.toLowerCase();
		char lastConsonant = ' ';
		
		for(int i = 0 ; i < strInput.length() ; i++){
			char ch = strInput.charAt(i);
			if(ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u') {
				if(strInput.indexOf(ch) == strInput.lastIndexOf(ch)) {
					lastConsonant = ch;
				}
			}
		}
		System.out.println("Last Consonent in given string is : "+lastConsonant);
	}
	
	public static void main(String[] args) {
		LastConsonantFromString lastConsonantFromString = new LastConsonantFromString();
		lastConsonantFromString.printLastConsonant("Aakanshaok");
	}
}
