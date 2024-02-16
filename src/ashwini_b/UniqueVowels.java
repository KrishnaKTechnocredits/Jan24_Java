package ashwini_b;
/*
Assignment - 56 : 14th Feb'2024
"Print only unique vowels:
input: technocredits
output: oi"
 */
public class UniqueVowels {
	
   void printUniqeVowel(String str) {
	   for (int i = 0 ; i < str.length(); i++) {
		   char ch = str.charAt(i);
		   if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			   if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				   System.out.print(ch);
			   }
		   }
	   }
   }

	public static void main(String[] args) {
		UniqueVowels uniqueVowels = new UniqueVowels();
		uniqueVowels.printUniqeVowel("technocredits");

	}

}
