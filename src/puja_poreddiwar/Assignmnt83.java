/*
Assignment-83 : 21st March'2024
I__am___in_pune____

output : I -> 2
         am -> 3
		 in -> 1
         pune -> 4	
*/
package puja_poreddiwar;

public class Assignmnt83 {

	void getUnderscroreCount(String str) {
		str = str + 'b';
		String word = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				word = word + ch;
			} else if ((ch == '_' && (Character.isLetter(str.charAt(i+1))))) {
				count++;
				System.out.println(word + "->" + count);
				word = "";
				count = 0;
			} else if (ch == '_') {
				count++;
			}
		}
	}

	public static void main(String[] args) {
		String str = "I__am___in_pune____";
		new Assignmnt83().getUnderscroreCount(str);
	}
}
