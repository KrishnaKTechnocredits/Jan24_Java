/*Assignment - 55 : 14th Feb'2024

"Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en"*/
package sveta;
public class Assignment_55 {

	int twiceOccurance(String str, char ch) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(ch==c) 
				count++;
		}
		return count;
	}
	
	public void charPrint(String str) {
		for(int i=0;i<str.length();i++) { 
			char ch = str.charAt(i);
			int count=twiceOccurance(str,ch);
			if(count==2)
				if(str.indexOf(ch)==i)
					System.out.print(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		String input= "teecccchhhnno";
		new Assignment_55().charPrint(input);
	}
}
