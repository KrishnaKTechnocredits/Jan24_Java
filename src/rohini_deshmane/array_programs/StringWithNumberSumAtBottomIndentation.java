package rohini_deshmane.array_programs;

/* Assignment 70, 22nd Feb. 2024
 * String str = "H5el2lo Hi Tec3hn2ocredits Pu1ne"
 *         Hello 
 * 			  Hi 
 * Technocredits 
 * 			Pune
 * 			  13
 */

public class StringWithNumberSumAtBottomIndentation {
	static int sum;
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
		for(int j=0; j<str.length();j++) {
			if(Character.isDigit(str.charAt(j))) {
				sum = sum+Character.getNumericValue(str.charAt(j));
			} else {
				newStr=newStr+Character.toString(str.charAt(j));
			}
		}
		return (newStr);
		
	}
	
	String[] checkIsDigitUpdate(String[] str) {
		String[] updatedStr= new String[str.length];
		String[] updatedStr2 = new String[str.length+1];
		String newStr="";
		
		for(int i=0; i < str.length; i++) {
			newStr = getStrDigit(str[i]);
			updatedStr[i] = newStr.trim();
		}
		for(int j=0; j<updatedStr2.length-1; j++) {
			updatedStr2[j] =updatedStr[j];
		}
		updatedStr2[updatedStr2.length-1] = Integer.toString(sum);
				
		return updatedStr2;
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
		StringWithNumberSumAtBottomIndentation spaceProgram = new StringWithNumberSumAtBottomIndentation();
		spaceProgram.printString(str);
	}
}
