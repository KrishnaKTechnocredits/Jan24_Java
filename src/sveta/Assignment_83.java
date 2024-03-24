/*Assignment-83 : 21st March'2024
I__am___in_pune____

output : I -> 2
         am -> 3
		 in -> 1
         pune -> 4	*/
package sveta;

public class Assignment_83 {

	void printWord(String input) {
		String temp="",underscoreTemp="";
		char[] chArr=input.toCharArray();
		for(char ch:chArr) {
			if(ch == '_') {
				underscoreTemp+=ch;
			}else {
				if(underscoreTemp.length()>0) {
					System.out.println(temp+" --> "+underscoreTemp.length());
					temp="";
					underscoreTemp="";
				}
				temp+=ch;
				
			}
			
		}
		if(temp!="") {
			
			System.out.println(temp+" --> "+underscoreTemp.length());
			
		}
	}
	
	public static void main(String[] args) {
		String str ="I__am___in_pune____";
		Assignment_83 ass_83=new Assignment_83();
		ass_83.printWord(str);
	}
}
