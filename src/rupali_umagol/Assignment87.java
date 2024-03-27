/*Code to reverse words in string:
 Input: Welcome to Technocredits
 Output: emocleW ot stiderconhceT*/

package rupali_umagol;

public class Assignment87 {
	String reverseSting(String str) {
		String output="";
		for(int i=str.length()-1;i>=0;i--) {
			output+=str.charAt(i);
		}
		return output;
	}
	
	String  printReverseString(String[] arr) {
		String result="";	
		for(int i=0;i<arr.length;i++) {
			String str=reverseSting(arr[i]);
			result+=str+" ";
		}
		return result.trim();
	}
	
	public static void main(String[] args) {
		String input="Welcome to Technocredits";
		String[] arr=input.split(" ");
		String output=new Assignment87().printReverseString(arr);
		System.out.println(output);
	}
}
