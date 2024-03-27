package samiksha;

public class ReverseFirstLastWord {
	
	String reverseStr(String str) {
		String output="";
		for(int index=str.length()-1;index>=0;index--) {
			char ch = str.charAt(index);
			output = output+ch;
		}
		return output;
	}
	
	void printStr(String[]arr) {
		String output="";
		String str1="";
		String str2="";
		for(int index=0;index<arr.length;index++) {
			str1=reverseStr(arr[0]);
			str2=reverseStr(arr[arr.length-1]);
			output= str1 + " " +  arr[1] +" " + " " +  arr[2] + " " + str2;
			
		}System.out.println(output);	
			
		}
	
	public static void main(String[] args) {
		String input = "Welcome to the Technocredits";
		String[]str=input.split(" ");
		new ReverseFirstLastWord().printStr(str);
	}

}
