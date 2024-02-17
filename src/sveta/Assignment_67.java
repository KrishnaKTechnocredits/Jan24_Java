/*Assignment - 67 : 17th Feb'2024
Create required methods to complete below 3 programs.
Its on you how many java classes you want to write, all methods in same class is also ok.

Program 1: 
input : Hi Hello Maulik
output : iH olleH kiluaM

PRogram 2: 
String str = "hi hEllO how are you";
output : Hi Hello How Are You

Program 3: 
input : Hi Hello Maulik
output : Ih Olleh Kiluam*/
package sveta;

public class Assignment_67 {

	public String camelCaseString(String str) {
		String str1="";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(i==0)
				str1+=Character.toUpperCase(ch);
			else
				str1+=ch;
		}
		return str1;
	}
	public void printString(String []arr) {
		String str1="";
		for(int i=0;i<arr.length;i++) {
			String str=camelCaseString(arr[i]);
			str1+=str+" ";
		}
		System.out.println(str1);
	}
	public static void main(String[] args) {
		String input= "hi hEllO how are you";
		String arr[]=input.split(" ");
		new Assignment_67().printString(arr);
	}

}
