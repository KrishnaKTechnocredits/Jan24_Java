/*
 * String str = "Hel12lo Hi Technocredits Pune";
 * Output :
          Hello
             Hi
  Technocredits
           Pune
 */
package shravani_rapelli;

public class Assignment69 {
	
	int getMaximumLengthOfWord(String[] arr) {
		int maxLength=0;
		for(int i=0; i<arr.length; i++) {
			if(maxLength < arr[i].length()) {
				maxLength = arr[i].length();
			}
		}
		return maxLength;
	}
	
	String getProcessString(String str, int maxLength) {
		int requiredSpace = maxLength - str.length();
		String res="";
		for(int i=0; i<requiredSpace; i++) {
			res = res + " ";
		}
		res = res + str;
		return res;
	}
	
	void rightAlignWords(String str) {
		String[] words = str.split(" ");
		int getMaximumLengthOfWord = getMaximumLengthOfWord(words);
		for(int i=0; i<words.length; i++) {
			String output = getProcessString(words[i],getMaximumLengthOfWord);
			System.out.println(output);
		}
	}
	
	public static void main(String[] args) {
		Assignment69 assgn69 = new Assignment69();
		String str = "Hello Hi Technocredits Pune";
	    assgn69.rightAlignWords(str);
	}

}
