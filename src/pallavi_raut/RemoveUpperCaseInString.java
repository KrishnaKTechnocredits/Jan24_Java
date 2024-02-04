/*Assignment - 27 : 30th Jan'24
Remove all Uppercase character from given String. 

input = "TechNoCREdits"
output : echodits

boolean Character.isUpperCase(char ch)
-------------------------------------------------------*/
package pallavi_raut;

class RemoveUpperCaseInString{
	 
	public static void main(String[] args){
		RemoveUpperCaseInString removeUpperCaseInString = new RemoveUpperCaseInString();
		removeUpperCaseInString.printWithoutUppercase("TechNoCREdits");
	}
		
	void printWithoutUppercase(String str){
		char ch;
		for (int index= 0; index < str.length(); index++){
			ch = str.charAt(index);
			boolean flag = Character.isUpperCase(ch);
				if (flag == true){
					str = str.replace(ch, '*');
				}
		}
		str = str.replace("*", "");
		System.out.println(str);
	}	
}