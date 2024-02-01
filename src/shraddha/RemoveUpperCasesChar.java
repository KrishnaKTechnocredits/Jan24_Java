/*Assignment - 27 : 30th Jan'24
Remove all Uppercase character from given String.*/

package shraddha;

class RemoveUpperCasesChar{
	void upperCaseChar(String str){
		String str1;
		boolean flag;
		for (int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
				str = str.replace(ch,'*');
		}
		
		str1 = str.replace("*","");
		System.out.println(str1);
	}
	
	public static void main(String[] args){
		RemoveUpperCasesChar remove = new RemoveUpperCasesChar();
		remove.upperCaseChar("TecHnOCreDiTs");
	}
}