package akshay_gaikwad;

public class UpCaseMoreThanLowCase {
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
		new UpCaseMoreThanLowCase().printStrUpCaseMoreThanLowCase(arr);
	}
}
