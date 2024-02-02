package rohini_deshmane;

public class ConsonantFromString {
	//Z, B, T, G, and H 
	void printLastConsonant(String str) {
		char consonant='a', ch;
		for(int i=0; i< str.length(); i++) {
			ch = str.charAt(i);
			if(ch == 'Z' || ch =='z' || ch == 'B' || ch == 'b' || ch =='T' || 
				ch =='t' || ch == 'G' || ch == 'g' || ch =='H' || ch =='h' ) {
				consonant = ch;
			}
		}
		System.out.println("Last Consonant from string = "+consonant);
	}
	
	public static void main(String[] args) {
		ConsonantFromString consonantFromString = new ConsonantFromString();
		consonantFromString.printLastConsonant("aakansha");
	}

}
