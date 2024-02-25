package shraddha;

class Assignment66{
	void replaceSpecialChar(String str){
		String str1="";
		for(int i=0;i<str.length();i++){
			if(Character.isDigit(str.charAt(i))){
				str1= str1+'*';
			}
			else
				str1=str1+str.charAt(i);
		}
			System.out.println(str1);
	}
	
	public static void main(String[] args){
		Assignment66 ass66 = new Assignment66();
		ass66.replaceSpecialChar("H2i H3el4lo P4un2e5");	
	}
}