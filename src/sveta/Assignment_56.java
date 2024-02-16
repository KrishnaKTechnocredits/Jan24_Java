/*Assignment - 56 : 14th Feb'2024
"Print only unique vowels:
input: technocredits
output: oi"*/
package sveta;

public class Assignment_56 {

	public void uniqueVowel(String str) {
		for (int i=0;i<str.length();i++) {
			str = str.toLowerCase();
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' ||ch == 'i'|| ch == 'o'|| ch == 'u') 
				if(str.indexOf(ch)== str.lastIndexOf(ch))
					System.out.print(ch);
		}
	}
	
	public static void main(String[] args) {
		String str ="technocredits";
		new Assignment_56().uniqueVowel(str);
	}
}