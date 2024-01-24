/*Print the frequency of the given character from the given String without case sensitivity (count lower + upper case), please consider given character will be passed as lowercase.

Input : technocrediTs teaches Technology.
Char: t
Output : frequency of t in technocredits is 4.
------------------------------------------*/
package pallavi_raut;	
class FrquencyOfChar{

	int count=0;
		
	void getCountOfChar(String str, char ch){
		for (int index=0; index <str.length(); index++){
			str=str.toLowerCase();
			if (str.charAt(index) == ch){
				count++;
			}
		}
		System.out.println("frequency of t in " + str +" is " + count);
	}
			
	public static void main(String[] args){
		FrquencyOfChar countChar=new FrquencyOfChar();
		countChar.getCountOfChar("technocrediTs teaches Technology", 't');
	}
}