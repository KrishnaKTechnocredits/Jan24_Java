package rupali_umagol;

public class Assignment46 {
	void printString(String input) {
		String upperCaseStr = "";
		String lowerCaseStr = "";
		String digitStr = "";
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(Character.isUpperCase(ch)) {
				upperCaseStr=upperCaseStr+ch;
			}else if(Character.isLowerCase(ch)) {
				lowerCaseStr=lowerCaseStr+ch;
			}else if(Character.isDigit(ch)) {
				digitStr=digitStr+ch;
			}
		}
		String ans=digitStr+upperCaseStr+lowerCaseStr;
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		Assignment46 assignment46=new Assignment46();
		assignment46.printString("AasH3v7i");
	}
}