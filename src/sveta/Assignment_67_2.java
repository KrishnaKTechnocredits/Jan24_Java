/*Program 3: 
input : Hi Hello Maulik
output : Ih Olleh Kiluam*/
package sveta;

public class Assignment_67_2 {

	public String camelCaseString(String str) {
		String str1="";
		str=str.toLowerCase();
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			if(i==str.length()-1)
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
		String input= "Hi Hello Maulik";
		String arr[]=input.split(" ");
		new Assignment_67_2().printString(arr);
	}
}

