/*
 * String str = "H5el6lo Hi Tech3noc2redits Pu1ne"
         7Hello
 5Technocredits
            0Hi
          1Pune
 */
package shravani_rapelli;

public class Assignment71 {
	
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
		int sum =0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}else {
				str1 = str1 + ch;
			}
		}
		return(sum + str1);
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
		Assignment71 assgn71 = new Assignment71();
		String input = "H5el2lo Hi Tech3noc2redits Pu1ne";
		assgn71.printAllStringToRightAllign(input);
	}

}

