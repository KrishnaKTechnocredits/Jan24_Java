package shraddha;

class UniqueChar{
	void printUniqueCharacter(String str1){
		String str = str1.toLowerCase();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch))
				System.out.print(str.charAt(i));
		}
	}
	
	public static void main(String[] args){
		UniqueChar uniqueChar = new UniqueChar();
		uniqueChar.printUniqueCharacter("TechnoCredits");
	}
}