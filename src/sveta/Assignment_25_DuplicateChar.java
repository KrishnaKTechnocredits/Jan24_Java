/*Assignment - 25 : 29th Jan'2024
Print all the duplicate characters from the given String.

input = "aakanksha";
output : ak  */
package sveta;

public class Assignment_25_DuplicateChar {

	public static void duplicatCharPrint(String str) {
		for(int i=0;i<=str.length()-1;i++){
			char ch = str.charAt(i);
			if(str.indexOf(ch)!=str.lastIndexOf(ch))
				if(str.indexOf(ch)==i)
					System.out.println(ch);
		}
	}
	public static void main(String[] args) {
		duplicatCharPrint("aakanksha");
	}

}
