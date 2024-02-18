package shraddha;

class Assignment65{
	void removeSpecial(String str){
		String str1 ="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' ' && !Character.isDigit(str.charAt(i)))
			str1 = str1+str.charAt(i);
		}
		System.out.println(str1);
		System.out.println(str1);
		
	}
	
	public static void main(String[] args){
		Assignment65 ass = new Assignment65();
		ass.removeSpecial("H2i H3el4lo P4un2e5");
	}
}