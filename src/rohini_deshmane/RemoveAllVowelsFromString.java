package rohini_deshmane;

public class RemoveAllVowelsFromString {
	
	void removeAllVowels(String str) {
		char ch;
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			if(ch=='a' || ch =='e'|| ch=='i'|| ch=='o' || ch =='u') {
				str = str.replace(ch, '*');
			}
		}
		str = str.replace("*", "");
		System.out.println(str);
	}

	public static void main(String[] args) {
		RemoveAllVowelsFromString removeAllVowelsFromString = new RemoveAllVowelsFromString();
		removeAllVowelsFromString.removeAllVowels("technocredits");
	}
}
