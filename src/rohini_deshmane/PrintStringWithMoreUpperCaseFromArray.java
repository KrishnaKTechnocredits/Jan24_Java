package rohini_deshmane;
/*
 *
 Assignment - 45 : 4th Feb'2024
Print all the names from given array if Uppercase characters are more then lowercase characters.

input : {"aAShVI", "TEchNoCRediTs", "ANSh","dhARMma","vIDhItA"}		 
Output : aAShVI
		 ANSh
		 vIDhItA
 */
public class PrintStringWithMoreUpperCaseFromArray {

	boolean isUpperCaseCharMore(String str) {
		boolean isMoreChar=false;
		int upperCaseCount=0, lowerCaseCount=0;
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				upperCaseCount++;
			} else if(Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}
		}
		
		if(upperCaseCount > lowerCaseCount) {
				isMoreChar=true;
		}
		return isMoreChar;
	}
	
	void printCharacter(String[] str) {
		for(int i=0; i<str.length; i++) {
			boolean flag = isUpperCaseCharMore(str[i]);
			if(flag == true) {
				System.out.println(str[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		PrintStringWithMoreUpperCaseFromArray moreUpperCount = new PrintStringWithMoreUpperCaseFromArray();
		String[] arr = {"aAShVI", "TEchNoCRediTs", "ANSh","dhARMma","vIDhItA" };
		moreUpperCount.printCharacter(arr);
	}
}
