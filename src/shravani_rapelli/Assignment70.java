/*
 * String str = "H5el6lo Hi Tech3noc2redits Pu1ne"
         52Hello
 32Technocredits
              Hi
           1Pune
 */
package shravani_rapelli;

public class Assignment70 {
	
	int getMaximumWOrdLength(String[] str) {
		int maxLen = 0;
		for(int i=0; i<str.length; i++) {
			if(maxLen < str[i].length()) {
				maxLen = str[i].length();
			}
		}
		return maxLen;
	}
	
	String getProcessData(String word,int maxLen) {
		int requiredSpace = maxLen - word.length();
		String output = "";
		for(int i=0;i<requiredSpace; i++) {
			output = output + " ";
		}
		output = output + word;
		return output;
	}
	
	String arrangeDigitsBeforeWord(String str) {
		String str1 = "";
		String str2 = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				str1 = str1 + ch;
			}else {
				str2 = str2 + ch;
			}
		}
		return(str1 + str2);
	}
	
	void printAllStringToRightAllign(String input) {
		String[] arr = input.split(" ");
		int getMaximumWOrdLength = getMaximumWOrdLength(arr);
		for(int i=0; i<arr.length; i++) {
			String str = arrangeDigitsBeforeWord(arr[i]);
			String output = getProcessData(str,getMaximumWOrdLength);
			System.out.println(output);
		}
	}
	
	public static void main(String[] args) {
		Assignment70 assgn70 = new Assignment70();
		String input = "H5el6lo Hi Tech3noc2redits Pu1ne";
		assgn70.printAllStringToRightAllign(input);
	}

}
