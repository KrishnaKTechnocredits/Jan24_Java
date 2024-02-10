package nikita_patil;

public class Assignment31 {
	int getCharFreq(String str, char getch){
	 	int count=0;
	 	for(int index = 0;index<str.length();index++) {
	 		char ch =str.charAt(index);
	 		if(ch==getch)
	 			count++;
	 	}
	 	return count;
	}
	void printall(String input){
		int max=0;
		char targetch=' ';
		boolean flag = false;
		for(int index = 0;index<input.length();index++){
			char ch =input.charAt(index);
			int count = getCharFreq(input, ch);
		

			if(max<count) {
				max = count;
				targetch=ch;
				flag = true;
			}
			else if (max==1) {
				flag = false;

			}
		}
		//if(max==1)
			//System.out.println("in given have all unique car");
		if(flag == true)
			System.out.println(input + " : " + targetch + " -> " + max);
		if(max==1)
			System.out.println(input + " -> have frequency of all character is one");
	}
	public static void main(String[] args) {
		Assignment31 a = new Assignment31();
		a.printall("aakansha");
	    a.printall("teecccchnoceredites");
	    a.printall("maulik");
	}
}



