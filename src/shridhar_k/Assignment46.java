//Rearrange a string in a way having all digits first followed by Uppercase followed by lowercase.
package shridhar_k;

public class Assignment46 {
	
	String getDigitsFromString(String inpStr) {
		String output = "";
		for(int i= 0; i < inpStr.length(); i++) {
			if(Character.isDigit(inpStr.charAt(i))) {
				output = output + inpStr.charAt(i);
			}
		}
		return output;
	}
	
	String getUpperCaseFromString(String inpStr) {
		String output = "";
		for(int i= 0; i < inpStr.length(); i++) {
			if(Character.isUpperCase(inpStr.charAt(i))) {
				output = output + inpStr.charAt(i);
			}
		}
		return output;
	}
	
	String getLpperCaseFromString(String inpStr) {
		String output = "";
		for(int i= 0; i < inpStr.length(); i++) {
			if(Character.isLowerCase(inpStr.charAt(i))) {
				output = output + inpStr.charAt(i);
			}
		}
		return output;
	}
	
	void rearrangeString(String[] arr) {
		for(int i =0; i <arr.length ; i++) {
			System.err.println(getDigitsFromString(arr[i]) + getUpperCaseFromString(arr[i]) + getLpperCaseFromString(arr[i]));
		}
	}
	
	public static void main(String[] args) {
		String arr[] = {"AasH3v7i"};
		new Assignment46().rearrangeString(arr);
	}
}
