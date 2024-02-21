package akshada_marne;

public class RemoveDigitWhiteSpace {
	
	void remove(String str) {
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)==true || ch==' ') {
				String temp=str.valueOf(ch);
				str=str.replace(temp, "*");
			}
		}
		str=str.replace("*", "");
		System.out.println(str);
		
	}
	
	
	
	public static void main(String args[]) {
		RemoveDigitWhiteSpace removeDigitWhiteSpace = new RemoveDigitWhiteSpace();
		removeDigitWhiteSpace.remove("H2i H3el4lo P4un2e5");
		
		
	}

}
