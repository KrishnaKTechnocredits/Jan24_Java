/*Assignment - 57 : 14th Feb'2024
"Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58"*/
package sveta;

public class Assignment_57 {

	public void printSqur(String str) {
		int no=0,no1=0;
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(Character.isDigit(ch)) 
				if(ch%2!=0) {
					no =Character.getNumericValue(ch);
					no1 += no * no; 
				}
		}
		System.out.println("Print sum of squares of odd digits : " +no1);
	}

	public static void main(String[] args) {
		String str = "te3ch4noc7red8its";
		new Assignment_57().printSqur(str);
	}
}


