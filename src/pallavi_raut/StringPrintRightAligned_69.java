/*input : "Hi Hello Technocredits Pune"
output : 
	    
	       Hi
	    Hello
Technocredits
         Pune
         */
package pallavi_raut;

public class StringPrintRightAligned_69 {

	public static void main(String[] args) {
		StringPrintRightAligned_69 StringPrintRightAligned = new StringPrintRightAligned_69();
		String input = "Hi Hello Technocredits Pune";
		String[] arr = input.split(" ");
		StringPrintRightAligned.printRightAlign(arr);
	}

	int getMaxLengthOfName(String[] str) {
		int max = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > max) {
				max = str[i].length();
			}
		}
		return max;
	}

	String printName(String str, int count) {
		String output = "";
		count = count - str.length();
		for (int i = 0; i < count; i++) {
			output = output + " ";
		}
		output = output + str;
		return output;
	}

	void printRightAlign(String[] str) {
		int count = getMaxLengthOfName(str);
		for (int i = 0; i < str.length; i++) {
			String output = printName(str[i], count);
			System.out.println(output);
		}
	}
}