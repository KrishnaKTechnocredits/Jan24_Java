/*Assignment - 31 : 4th Feb'2024

Write a program to find character having maximum frequency from given String.

input : aakanksha
output : aakanksha -> a -> 4

input : teecccchnoceredites
output : teecccchnoceredites -> e -> 5

input : maulik
output : maulik having all unique characters*/

package sarang_kulkarni;

public class MaxCharFreq {

	void printCharFrequency(String str){
		String str1 = str.toLowerCase();
		int lastCount=0;
		char ch1=' ';
		for (int i=0;i<str1.length();i++){
			char ch = str1.charAt(i);
			int count=1;
			for(int j=0;j<str1.length();j++){
				if(i!=j){
					if(ch == str1.charAt(j)){
						count=count+1;
					}
				}
			}
			if(count>lastCount){
				lastCount=count;
				ch1=ch;
			}		
		}
		if(lastCount!=1)
		System.out.println(str+"-> "+ch1+"->"+lastCount);
			else
				System.out.println("maulik having all unique characters");
	}

		public static void main(String[] args){
			MaxCharFreq unique = new MaxCharFreq();
			unique.printCharFrequency("aakanksha");
			unique.printCharFrequency("teecccchnoceredites");
			unique.printCharFrequency("maulik");
			}
}
