/*Assignment - 64: 16th Feb'2024
"Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH37i-?!"*/
package sveta;

public class Assignment_64 {

	public void getSpecialChar(String str) {
		String specialCharStr="";
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(!Character.isLetter(ch)&& !Character.isDigit(ch)) {
				specialCharStr+=ch;
				str=str.replace(ch, '*');
			}
		}
		str=str.replace("*", "");
		System.out.println(str+specialCharStr);
	}
	public static void main(String[] args) {
		new Assignment_64().getSpecialChar("-AasH?3v7i!");
	}

}
