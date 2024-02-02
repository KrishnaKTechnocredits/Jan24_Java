package rohini_deshmane;

public class ConsonantFromString {
	//Z, B, T, G, and H 
	void printLastConsonant(String str) {
		char consonant='-', ch;
		//char lastConsonantChar;
		for(int i=0; i< str.length(); i++) {
			ch = str.charAt(i);
			if(ch!='a' || ch!='A' || ch != 'e' || ch != 'E' || ch !='I' || 
				ch !='i' || ch != 'O' || ch != 'o' || ch !='u' || ch !='U' ) {
				if (str.indexOf(ch) == str.lastIndexOf(ch)){
					consonant = str.charAt(i);
				}
			}
		}
		System.out.println("Last Consonant from string = "+consonant);
	}
	
	public static void main(String[] args) {
		ConsonantFromString consonantFromString = new ConsonantFromString();
		consonantFromString.printLastConsonant("aakansha");
	}

}
