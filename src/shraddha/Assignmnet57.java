package shraddha;

class Assignmnet57{

	boolean isDigit(char ch){
		if(Character.isDigit(ch)){
			return true;
		}
		return false;
	}
	void squareOf(String Str){
		int sum =0;
		for(int i=0;i<Str.length();i++){
			char ch = Str.charAt(i);
			if (isDigit(ch)){
				int num = Character.getNumericValue(ch);
				if(num%2!=0){
					sum = sum + (num * num);
					
				}
			}
		}
			System.out.println(sum);
	}
		
		public static void main(String[] args){
			Assignmnet57 assignmnet = new Assignmnet57();
			assignmnet.squareOf("te3ch4noc7red8its");
		}
		
}