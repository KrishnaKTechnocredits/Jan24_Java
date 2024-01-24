class Casesensetive{
	void print(String str,char ch){
		int count=0;
		char charAtPos;
		String str1 = str.toLowerCase();
		for (int input=0; input< str1.length();input++){
			charAtPos = str1.charAt(input);
			if(charAtPos == ch)
				count++;
		}
		System.out.println("frequency of t in technocredits is: "+count);
	}
	public static void main(String[] args){
		Casesensetive casesensetive = new Casesensetive();
		casesensetive.print("TechnoCredits Teaching",'t');
	}
}