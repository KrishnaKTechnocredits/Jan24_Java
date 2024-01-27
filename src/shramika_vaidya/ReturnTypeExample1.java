package shramika_vaidya;

class ReturnTypeExample1{

	void PrintData(String input,char targetChar){
		input = input.toLowerCase();
		int count=0;
		for(int index=0;index<input.length();index++){
			char ch = input.charAt(index);
			if(ch==targetChar)
				count++;
		}
		System.out.println("frequency of " + targetChar + " in 'technocrediTs teaches Technology' is " + count);
	}
	
	public static void main(String[] args){
		ReturnTypeExample1 returnTypeExample1 = new ReturnTypeExample1();
		returnTypeExample1.PrintData("technocrediTs teaches Technology ",'t');
	}
}