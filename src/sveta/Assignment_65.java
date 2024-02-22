/*Assignment - 65 :  16th Feb'2024
"Remove digits and whitespace characters:
input: H2i H3el4lo P4un2e5
output: HiHelloPune"*/
package sveta;

public class Assignment_65 {

	public String printString(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLetter(ch)) {
				str1+=ch;
			}
		}
		return str1;
	}
	public static void main(String[] args) {
		String str=new Assignment_65().printString("H2i H3el4lo P4un2e5");
		System.out.println(str);
	}

}
