package shraddha;

class Assignment62{
	void sumOfDigits(String str){
		String str1="";
		float sum=0;
		for(int i=0;i<str.length();i++){
		
			if(Character.isDigit(str.charAt(i))){
				if(str.charAt(i+1)!='.')
				{
					Character ch = str.charAt(i);
					sum=sum+ch.getNumericValue(ch);
				}
				else
				{	
					String str2 = str.substring(i,i+3);
					sum=sum+Float.valueOf(str2);
					i=i+2;
				}
			}
		}
			System.out.println(sum);
	}
	
	public static void main(String[] args){
		Assignment62 ass62 = new Assignment62();
		ass62.sumOfDigits("te3ch4.5noc7red8.1its");	
	}
}