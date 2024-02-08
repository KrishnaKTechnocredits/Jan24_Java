/*Write a program to find character having maximum frequency from given String.
input : aakanksha
output : aakanksha -> a -> 4

input : teecccchnoceredites
output : teecccchnoceredites -> e -> 5

input : maulik
output : maulik having all unique characters  ------*/
package pallavi_raut;
class MaxCharFreqInString{

	public static void main(String[] args){
		MaxCharFreqInString maxCharFreqInString = new MaxCharFreqInString();
		maxCharFreqInString.printAllCharFreq("aakanksha");
		maxCharFreqInString.printAllCharFreq("teecccchnoceredites");
		maxCharFreqInString.printAllCharFreq("maulik");
	}
	
	int getCharFreqCount(String str, char targetCh){
		int count=0;
		for(int index=0; index< str.length(); index ++){
			char ch= str.charAt(index);
			if (ch == targetCh){
				count++;
			}
		}
		return count;
	}	
		
	void printAllCharFreq(String str){
		int max=0;
		char targetCh= ' ';
		for (int index=0; index < str.length() ; index ++){
			char ch= str.charAt(index);
			int count= getCharFreqCount(str, ch);
			if (max< count){
				max= count;
				targetCh=ch;
			}
		}
		if (max == 1){
			System.out.println(str + " having all unique characters " );
		}
		else {		
			System.out.println(str + "-> " + targetCh + " -> " + max);	
		}
	}
}	