package samiksha;

public class ReverseFirstAndLastChar {
	
	String getReverse(String str) {
		String output ="";
		char ch=' ';
		char ch1=' ';
		for(int index=0;index<str.length();index++) {
			 ch=str.charAt(0);
			 ch1 = str.charAt(str.length()-1);
			char A=str.charAt(index);
			output=output+A;
		}output = ch1 + output.substring(1,str.length()-1)+ ch;
		return output;
	}
	
	void printStr(String[]str) {
		String arr="";
		for(int index=0; index<str.length;index++) {
			String output = getReverse(str[index]);
			arr=arr + output + " ";
		}System.out.println(arr.trim());
	}
	public static void main(String[] args) {
		String str="Welcome to the Technocredits";
		String[] input =str.split(" ");
		new ReverseFirstAndLastChar().printStr(input);
	}

}
