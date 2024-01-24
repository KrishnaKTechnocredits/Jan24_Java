package shraddha;

class CasesensetiveExmp{
	void print(String str,char ch){
		char charAtPos;
		int count = 0;
		String str1 = str.toLowerCase();
		for(int input=0;input< str1.length();input++){
			charAtPos = str1.charAt(input);
			if(charAtPos == ch)
				count++;
		}
		System.out.println("Frequency of t in technoCredits Teaching is: "+count);
	}
	
	public static void main(String[] args){
		CasesensetiveExmp casecensetive = new CasesensetiveExmp();
		casecensetive.print("TechnoCredits Teaching",'t');
	}
}