package rohini_deshmane.string_programs;
/*
 * Assignment - 55 : 14th Feb'2024

"Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en"
 */
public class CharWithTwiceOccurance {
	
	int getCharCount(char ch, String str) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.toLowerCase().charAt(i) == Character.toLowerCase(ch)) {
				count++;
			}
		}
		return count;
	}
	
	void printCharTwiceOccurance(String str){
		String twiceChar;
		int count;
		for(int i=0; i< str.length(); i++) {
			if(getCharCount(str.charAt(i),str) == 2 && str.indexOf(str.charAt(i))==i) {
					System.out.println(str.charAt(i));
				
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "teecccchhhnno";
		CharWithTwiceOccurance charOccurance = new CharWithTwiceOccurance();
		charOccurance.printCharTwiceOccurance(str);
	}

}
