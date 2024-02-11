/*
Assignment - 31 : 4th Feb'2024
Write a program to find character having maximum frequency from given String.

input : aakanksha
output : aakanksha -> a -> 4

input : teecccchnoceredites
output : teecccchnoceredites -> e -> 5

input : maulik
output : maulik having all unique characters */
 package sveta;

class Assignment_31_MostFrequent{
	
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
			//System.out.println(ch + "->"+count);
			
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
		Assignment_31_MostFrequent ex = new Assignment_31_MostFrequent();
		ex.printall("aakansha");
		ex.printall("teecccchnoceredites");
		ex.printall("maulik");
	}
}