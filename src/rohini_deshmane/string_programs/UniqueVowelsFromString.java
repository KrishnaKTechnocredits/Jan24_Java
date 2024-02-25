package rohini_deshmane.string_programs;
/*
 * Assignment - 56 : 14th Feb'2024
"Print only unique vowels:
input: technocredits
output: oi"

 */
public class UniqueVowelsFromString {

	void printUniqueVowels(String str) {
		char ch;
		for(int i=0; i<str.length();i++) {
			ch = str.charAt(i);
			if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch=='u') {
				if(str.lastIndexOf(ch) == str.indexOf(ch)) {
					System.out.println(ch);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		UniqueVowelsFromString uniqueVowelsFromString = new UniqueVowelsFromString();
		uniqueVowelsFromString.printUniqueVowels("technocredits");
	}
}
