package shravani_rapelli;

public class Assignment45 {
	
	boolean isUpperCaseMoreThanLowerCase(String str) {
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				upperCaseCount++;
			}else if(Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}
		}
		if(upperCaseCount > lowerCaseCount) {
			return true;
		}else {
			return false;
		}
	}
	
	void printNamesFromArray(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			String str = arr[i];
			if(isUpperCaseMoreThanLowerCase(str)) {
				System.out.println(str);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment45 assign45 = new Assignment45();
		String[] arr = {"aAShVI","TEchNoCRediTs","ANSh","dhARMma","vIDhItA"};
		assign45.printNamesFromArray(arr);
	}

}
