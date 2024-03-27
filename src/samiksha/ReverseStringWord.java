package samiksha;

public class ReverseStringWord {
	
	String  reverseStr(String str) {
		String output="";
		for(int index=str.length()-1;index>=0;index--) {
			char ch = str.charAt(index);
			output = output + ch;
		}
		return output;
	}
	void printStr(String[]arr) {
		String str="";
		for(int index=0; index<arr.length;index++) {
		   String output = reverseStr(arr[index]);
		   str = str + output + " ";
		}
		System.out.println(str.trim());
	
		
		
	}
	
	public static void main(String[] args) {
		String input ="Welcome to Technocredits";
		String[]arr= input.split(" ");
		new ReverseStringWord().printStr(arr);
	}

}
