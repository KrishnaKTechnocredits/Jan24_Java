/*
 * String str = "H5el6lo Hi Tech3noc2redits Pu1ne"
        Hello
Technocredits
           Hi
         Pune
           17
 */
package shravani_rapelli;

public class Assignment72 {
	
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
	
	String SumOfDigits(String str) {
		String result = "";
		int sum =0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
				str = str.replace(ch, '*');
			}
		}
		str = str.replace("*", "");
		result = str + " " + sum;
		return result;
	}
	
	void printAllStringToRightAllign(String input) {
		String output = SumOfDigits(input);
		String[] arr = output.split(" ");
		int getMaximumWOrdLength = getMaximumWOrdLength(arr);
		for(int i=0; i<arr.length; i++) {
			String str = getProcessData(arr[i], getMaximumWOrdLength);
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		Assignment72 assgn72 = new Assignment72();
		String input = "H5el6lo Hi Tech3noc2redits Pu1ne";
		assgn72.printAllStringToRightAllign(input);
	}

}

