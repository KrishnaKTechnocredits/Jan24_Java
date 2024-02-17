package shraddha;

class Assignment61{
	void negativeSum(String str){
		int sum=0;
		for (int i=0;i<str.length();i++){
			if(str.charAt(i)=='-') {
				char ch1= str.charAt(i+1);
				sum= sum+Character.getNumericValue(ch1)*-1;
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args){
		Assignment61 ass = new Assignment61();
		ass.negativeSum("te-3ch4noc7red-8its");
	}
}