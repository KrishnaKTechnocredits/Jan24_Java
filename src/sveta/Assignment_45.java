package sveta;

public class Assignment_45 {

	public int isUpperCaseGrater(String str){
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) 
				count++;
		}
		return count;
	}
	public int isLowerCaseGrater(String str){
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)) 
				count++;
		}
		return count;
	}
	
	public void printString(String []arr) {
		for(int i=0;i<arr.length;i++) {
			int countUpperCase=isUpperCaseGrater(arr[i]);
			int countLowerCase = isLowerCaseGrater(arr[i]);
			if(countUpperCase>countLowerCase) 
				System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		String []arr = {"aAShVI", "TEchNoCRediTs", "ANSh","dhARMma","vIDhItA"};
		new Assignment_45().printString(arr);
	}
}
