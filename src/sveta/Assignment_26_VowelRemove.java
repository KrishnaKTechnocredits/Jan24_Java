/*Assignment - 26 : 30th Jan'24
Remove all the vowels from given String.
input : technocredits
*/
package sveta;

public class Assignment_26_VowelRemove {

	public static void vowelRemove(String str) {
		char ch=' ';
		for(int i=0;i<=str.length()-1;i++){
			ch = str.charAt(i);
			if(ch =='a' || ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') 
				str = str.replace(String.valueOf(ch),"#");
		}
		str = str.replace("#","");
		System.out.println(str);	
	}
	
	public static void main(String[] args) {

		vowelRemove("technocredits");
	}

}
