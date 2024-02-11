/*Assignment - 52 : 10th Feb'2024
String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
output : {134,56,47,0}*/
package sveta;

public class Assignment_52 {

	public int getDigit(String str) {
		String str1="0";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)==true) 
				str1+=ch;
		}
		return Integer.parseInt(str1);
	}
	
	public void printDigit(String []arr) {
		for(int input=0;input<arr.length;input++) {
			String str=arr[input];
			int i[] =new int[arr.length]; 
			i[input] += getDigit(str);
			System.out.println(i[input]);
		}
	}
	
	public static void main(String[] args) {
		String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
		new Assignment_52().printDigit(arr);	
	}
}
