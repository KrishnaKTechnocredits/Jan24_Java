package shraddha;

class StringEx{
	void findDigits(String str){
		int count =0;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
				count++;
		}
		System.out.println("Given String has "+count+" digits");
	}
	
	public static void main(String[] args){
		StringEx stringEx = new StringEx();
		stringEx.findDigits("te3c3hn5o2cre3dits");
	}
}