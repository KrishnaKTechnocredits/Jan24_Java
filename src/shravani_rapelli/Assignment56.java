/*
 "Print only unique vowels:
input: technocredits
output: oi"
 */
package shravani_rapelli;

public class Assignment56 {
	
	void printOnlyUniqueVowels(String input) {
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch) == input.lastIndexOf(ch)) {
			if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u') 
				System.out.println(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment56 assign56 = new Assignment56();
		assign56.printOnlyUniqueVowels("technocredits");
	}

}
