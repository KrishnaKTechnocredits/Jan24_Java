/*Assignment - 27 : 30th Jan'24
Remove all Uppercase character from given String. 

input = "TechNoCREdits"
output : echodits

boolean Character.isUpperCase(char ch) */
package sveta;

public class Assignment_27_UppercaseRemove {

	public static void removeUppercase(String str) {
		char ch=' ';
		for (int i=0;i<=str.length()-1;i++) {
			ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				str = str.replace(ch,'*');
					
			}
		}
		str = str.replace("*","");
		System.out.println(str);
	}
	public static void main(String[] Args) {
		removeUppercase("TechNoCREdits");
	}

}
