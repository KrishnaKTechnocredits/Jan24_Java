package hiral_purohit;
/*Code to reverse words in string:
 Input: Welcome to Technocredits
 Output: emocleW ot stiderconhceT*/
public class Assignment_87 {
	
	String toGetReverseString(String str) {
		String temp="";
		for(int i=str.length()-1; i>=0; i--) {
			char ch=str.charAt(i);
			temp=temp+ch;
		}
		return temp;
	}
	
	void toGetreverseString(String str) {
		String[] arr=str.split(" ");
		String output="";
		for(int i=0; i<arr.length; i++) {
			output=output+" "+toGetReverseString(arr[i]);
		}System.out.println(output.trim());
	}
	
	public static void main(String[] args) {
		String str="Welcome to Technocredits";
		new Assignment_87().toGetreverseString(str);
	}

}
