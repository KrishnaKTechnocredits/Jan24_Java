package varsha;

public class CharacterEx1 {
	
	void printDigit(String input) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			boolean isflag = Character.isDigit(ch);
			if(isflag == true) {
				count++;
			}
		}
		System.out.println("Total digit is : " + count);
	}
	
	public static void main(String[] args) {
		CharacterEx1 charaterEx1 = new CharacterEx1();
		charaterEx1.printDigit("te3c3hn5o2cre3dits");
	}

}
