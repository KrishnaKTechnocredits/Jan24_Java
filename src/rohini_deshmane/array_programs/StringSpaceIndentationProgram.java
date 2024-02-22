package rohini_deshmane.array_programs;

/* Assignment 69, 22nd Feb. 2024
 * String str = "Hello Hi Technocredits Pune"
 *         Hello 
 * 			  Hi 
 * Technocredits 
 * 			Pune
 */

public class StringSpaceIndentationProgram { 
	
	int findLargeStringLength(String[] strArr) {
		int largeCount=0;
		for(int i=0; i<strArr.length; i++) {
			if(largeCount<strArr[i].length()) {
				largeCount = strArr[i].length();
			}
		}
		return largeCount;
	}

	void printString(String str) {
		String[] strArr = new String[3];
		strArr = str.split(" ");
		int largeStrLen;
		largeStrLen = findLargeStringLength(strArr);
		
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<largeStrLen-(strArr[i].length()); j++) {
				System.out.print(" ");
			}
			System.out.print(strArr[i]+"\n");
		}	
	}
	
	public static void main(String[] args) {
		String str = "Hello Hi Technocredits Pune";
		StringSpaceIndentationProgram spaceProgram = new StringSpaceIndentationProgram();
		spaceProgram.printString(str);
	}
}
