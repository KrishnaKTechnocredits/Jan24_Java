/*Assignment - 58 : 14th Feb'2024
"Print last character with minimum frequency:
input: aakanksha
output: h->1"*/
package sveta;

public class Assignment_58 {

	public void minFrequency(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.println("character with minimum frequency -> " + ch);
				break;
			}
		}
	}
	
	public static void main(String []args) {
		String str = "aakanksha";
		new Assignment_58().minFrequency(str);
	}
}
