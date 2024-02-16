/*"Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH37i-?!"
*/

package garima_s;
class PrintSpecialCharacterEnd{
	void printSpecialCharacterEnd(String input){
		String str1="",str2="",str="";
		for(int index=0;index<input.length();index++){
			char ch=input.charAt(index);
			if(!Character.isUpperCase(ch)&&!Character.isLowerCase(ch)&&!Character.isDigit(ch)){
				str1=str1+ch;
			}
			else
				str2=str2+ch;
		}
		str=str2+str1;
		System.out.println("Special Characters in End in String : "+str);
}

	public static void main(String[] args){
		String input="-AasH?3v7i!";
		new PrintSpecialCharacterEnd().printSpecialCharacterEnd(input);
	}
}
		