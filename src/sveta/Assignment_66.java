/*Assignment - 66 : 16th Feb'2024
"Replace digits with a specific character ('*'):
input: H2i H3el4lo P4un2e5
output: H*i H*el*lo P*un*e*"*/
package sveta;

public class Assignment_66 {

	public String printString(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				str1+='*';
			}
			else {
				str1+=ch;
			}
		}
		return str1;
	}
	public static void main(String[] args) {
		Assignment_66 ass =new Assignment_66();
		String str=ass.printString("H2i H3el4lo P4un2e5");
		System.out.println(str);
	}

}
