package shramika_vaidya;

class StringExample1{

	void PrintData(String input,char targetChar){
		int count=0;
		for(int index=0;index<input.length();index++){
			char ch = input.charAt(index);
			if(ch==targetChar)
				count++;
		}
		System.out.println("frequency of " + targetChar + " in technocredits is " + count);
	}
	
	public static void main(String[] args){
		StringExample1 stringExample1 = new StringExample1();
		stringExample1.PrintData("technocredits",'t');
	}
}