/*Assignment - 23 : 29th Jan'2024
Print all the characters from given String having frequency 1 (print unique characters from given string) [without indexOf & lastIndexOf]

String str = "technocredits";
output : hnordis
-------------------------------------------------------------------------------*/
package pallavi_raut;
public class FindCharFreq1Normal{
	
	public static void main(String[] args){
		FindCharFreq1Normal findCharFreq1Normal = new FindCharFreq1Normal ();
		findCharFreq1Normal.printCharFreq("technsocredits");
	}
	
	void printCharFreq(String str){
		int count=0;
		char ch;
		for (int index = 0 ; index < str.length(); index++){
			ch=str.charAt(index);
			count=0;
			for (int j =  str.length()-1; j >= 0; j--){
				if (ch == str.charAt(j)){
					count++;
				}	
			}
			if (count == 1){
				System.out.println(ch);
			}	
		}
	}
}	

