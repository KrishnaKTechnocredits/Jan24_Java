package shraddha;

class Assignment64{
	void isAlphabet(String str){
		String str1="";
		String str2="";
		for(int i=0;i<str.length();i++){
			if(Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))){
				str1= str1+str.charAt(i);
			}
			else
				str2=str2+str.charAt(i);
		}
			System.out.println(str1+str2);
	}
	
	public static void main(String[] args){
		Assignment64 ass64 = new Assignment64();
		ass64.isAlphabet("-AasH?3v7i!");	
	}
}