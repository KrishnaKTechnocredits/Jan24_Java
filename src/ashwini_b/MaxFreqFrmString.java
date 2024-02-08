package ashwini_b;

/*
 Assignment - 31 : 4th Feb'2024
Write a program to find character having maximum frequency from given String.
input : aakanksha
output : aakanksha -> a -> 4
input : teecccchnoceredites
output : teecccchnoceredites -> e -> 5
input : maulik
output : maulik having all unique characters
 */
public class MaxFreqFrmString {
    
	int getCharFrequency(String input , char targetch){
		int count = 0;
		for(int index = 0 ; index < input.length() ; index++) {
			char ch = input.charAt(index);
			if(ch == targetch) {	
			  count++;
			}
		}
		//System.out.println(count);
		return count;
	}
	
	void printAllCharFreq(String input) {
		int max = 0;
		char maxcountchar = 0;
		for(int index = 0 ; index < input.length() ; index++) {
			char ch = input.charAt(index);
			int count = getCharFrequency(input, ch);
		   // System.out.println(ch +  "->" + count);
			if(count > max) {
				max = count ;	
				maxcountchar = ch;
			}
		}
		if(max ==1) {
			System.out.println(input + " having all unique characters.");
		}
		else {
			System.out.println(input + " -> " + maxcountchar+ " -> " + max);

		}
	}
		
	public static void main(String[] args) {
		MaxFreqFrmString maxFreqFrmString = new MaxFreqFrmString();
		maxFreqFrmString.printAllCharFreq("aakanksha");
		maxFreqFrmString.printAllCharFreq("teecccchnoceredites");
		maxFreqFrmString.printAllCharFreq("maulik");
	
	}

}
