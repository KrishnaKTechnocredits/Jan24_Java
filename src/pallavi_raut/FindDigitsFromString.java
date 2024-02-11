/*Assignment - 47 : 4th Feb'2024 
Return the string extracting all the digits from it. 
input :-Aas-H3v7i
output:-37
hint
if(!Character.isDigit(ch))
        str = str + ch; ------------------*/

package pallavi_raut;

public class FindDigitsFromString {
	void getDigitsFromString(String str) {
		String output = "";
		for(int i= 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				output = output + str.charAt(i);
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String input = "Aas-H3v7i";
		new FindDigitsFromString().getDigitsFromString(input);
	}
}
