/*Assignment - 87 : 24th March'2024 [15-20 mins]
Code to reverse words in string:
 Input: Welcome to Technocredits
 Output: emocleW ot stiderconhceT*/
package sveta;

public class Assignment_87 {

	static String reverseWord(String word) {
		String str="";
		for(int i=word.length()-1;i>=0;i--) {
			str+=word.charAt(i);
		}
		return str;
	}
	public void reverseString(String str) {
		String[] arr=str.split(" ");
		String str1="";
		for(int i=0;i<arr.length;i++) {
			str1+=reverseWord(arr[i])+" ";
		}
		System.out.println("Reverse Word String : "+str1);
	}
	public static void main(String[] args) {
		String input ="Welcome to technocredits";
		System.out.println("Original String : "+input);
		new Assignment_87().reverseString(input);
	}

}
