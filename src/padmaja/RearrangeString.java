/*Assignment - 46 : 4th Feb'2024
Rearrange a string in a way having all digits first followed by Uppercase followed by lowercase.
 
input :-AasH3v7i
output:-37AHsvi

hint
String upperCaseStr = "";
String lowerCaseStr = "";
String digitStr = "";

if(Character.isDigit(ch))
	digitStr = digitStr + ch;
else if(Character.isUpperCase(ch))
	str1 = str1 + ch;

String ans = digitStr+upperCaseStr+lowerCaseStr;
return ans;
*/

package padmaja;

public class RearrangeString {

	void rearrangeString(String str) {
		String digitStr = "";
		String upperStr = "";
		String lowerStr = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				digitStr += ch;
			else if (Character.isUpperCase(ch))
				upperStr += ch;
			else if (Character.isLowerCase(ch))
				lowerStr += ch;
		}

		String output = digitStr + upperStr + lowerStr;
		System.out.println(output);
	}

	public static void main(String[] args) {
		RearrangeString rearrangeString = new RearrangeString();
		rearrangeString.rearrangeString("AasH3v7i");
	}
}
