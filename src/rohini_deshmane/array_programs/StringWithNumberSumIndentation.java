package rohini_deshmane.array_programs;

/* Assignment 70, 22nd Feb. 2024
 * String str = "H5el2lo Hi Tec3hn2ocredits Pu1ne"
 *         7Hello 
 * 			    Hi 
 * 5Technocredits 
 * 			 1Pune
 */

public class StringWithNumberSumIndentation {
	int findLargeStringLength(String[] strArr) {
		int largeCount=0;
		for(int i=0; i<strArr.length; i++) {
			if(largeCount<strArr[i].length()) {
				largeCount = strArr[i].length();
			}
		}
		return largeCount;
	}
	
	String getStrDigit(String str) {
		String newStr="";
		int sum = 0;
		
		for(int j=0; j<str.length();j++) {
			if(Character.isDigit(str.charAt(j))) {
				sum = sum+Character.getNumericValue(str.charAt(j));
				//digit=Character.toString(sum);
			} else {
				newStr=newStr+Character.toString(str.charAt(j));
			}
		}
		//System.out.println(sum);
		return (sum+newStr);
		
	}
	
	String[] checkIsDigitUpdate(String[] str) {
		String[] updatedStr= new String[str.length];
		String newStr="";
		
		for(int i=0; i < str.length; i++) {
			newStr = getStrDigit(str[i]);
			updatedStr[i] = newStr.trim();
		}
				
		return updatedStr;
	}

	void printString(String str) {
		String[] strArr = new String[3];
		strArr = str.split(" ");
		int largeStrLen;
		String[] updatedStrArr = checkIsDigitUpdate(strArr);
		largeStrLen = findLargeStringLength(updatedStrArr);
		
		for(int i=0; i<updatedStrArr.length; i++) {
			for(int j=0; j<largeStrLen-(updatedStrArr[i].length()); j++) {
				System.out.print(" ");
			}
			System.out.print(updatedStrArr[i]+"\n");
		}	
	}
	
	public static void main(String[] args) {
		String str = "H5el2lo Hi Tec3hn2ocredits Pu1ne";
		StringWithNumberSumIndentation spaceProgram = new StringWithNumberSumIndentation();
		spaceProgram.printString(str);
	}
}
