/*input : Hi Hello Maulik
output : Ih Olleh Kiluam*/
package akshay_gaikwad;

public class ReverseAndCapitalLetter {
	
	String reverseStr(String str) {
		String output = "";
		for (int index = str.length()-1 ; index >= 0; index--) {
			char ch = str.charAt(index);
			output += ch;
		}
		return output;
	}
	
	void reverseStrWithCapital1stLetter(String str) {
		String [] strArr = str.split(" ");
		String output = "";
		for (int index = 0; index < strArr.length; index++) {
			String revStr = reverseStr(strArr[index]).toLowerCase();
			output += Character.toUpperCase(revStr.charAt(0)) + revStr.substring(1) + " ";
		}
		System.out.println("Output : " +output);
	}
	
	public static void main(String[] args) {
		String str = "Hi Hello Maulik";
		System.out.println("Input : " + str);
		new ReverseAndCapitalLetter().reverseStrWithCapital1stLetter(str);
	}
}
