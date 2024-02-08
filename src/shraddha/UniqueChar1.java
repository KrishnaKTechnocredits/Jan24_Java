package shraddha;

class UniqueChar1{
	void printUniqueCharacter(String str1){
		String str = str1.toLowerCase();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			int count =0;
			for(int input=0;input<str.length();input++){
				if(i!=input)
					if(ch == str.charAt(input))
						count=1;
			}
			if(count==0)
			System.out.print(ch);
			}
		}
	
	public static void main(String[] args){
		UniqueChar1 uniqueChar1 = new UniqueChar1();
		uniqueChar1.printUniqueCharacter("TechnoCredits");
	}
}