package akshay_gaikwad;

public class ReverseAllWords {
	String reverseWord(String str){
		String output = "";
		for(int index = str.length()-1 ; index >= 0; index--){
			output += str.charAt(index); 
		}
		return output;
	}
	
	void reverseWordsFromString(String str){
		String[] arr = str.split(" ");
		for(int i = 0; i< arr.length; i++){
			System.out.print(reverseWord(arr[i] + " "));
		}
	}
	public static void main(String[] args) {
		String input = "Welcome to Technocredits";
		new ReverseAllWords().reverseWordsFromString(input.trim());
	}
}
