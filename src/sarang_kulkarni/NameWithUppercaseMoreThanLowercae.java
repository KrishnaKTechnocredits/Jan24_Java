/*
 * Assignment - 45 : 4th Feb'2024
Print all the names from given array if Uppercase characters are more then lowercase characters.

input : {"aAShVI", "TEchNoCRediTs", "ANSh","dhARMma","vIDhItA"}		 
Output : aAShVI
		 ANSh
		 vIDhItA*/
package sarang_kulkarni;

public class NameWithUppercaseMoreThanLowercae {

	void printStrUpCaseMoreThanLowCase(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			if (isUpCaseMoreThanLowCase(str)) {
				System.out.println(str);
			}
		}
	}

	boolean isUpCaseMoreThanLowCase(String str) {
		int upCaseCount = 0;
		int lowCaseCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch)) {
				upCaseCount++;
			}else if (Character.isLowerCase(ch)) {
				lowCaseCount++;
			}
		}
		if (upCaseCount > lowCaseCount) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		String [] arr =  {"aAShVI", "TEchNoCRediTs", "ANSh","dhARMma","vIDhItA"};
		new NameWithUppercaseMoreThanLowercae().printStrUpCaseMoreThanLowCase(arr);
	}
}
