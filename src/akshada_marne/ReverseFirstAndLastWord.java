package akshada_marne;

public class ReverseFirstAndLastWord {
	
	String reverse(String str) {
		String output="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			output=output+ch;		
		}
		
		return output;
	}

	void display(String[] arr) {
		for(int i=0;i<arr.length;i++) {
		if(i==0 || i==arr.length-1) {
			String	output=reverse(arr[i]);
			output.trim();
			System.out.print(output+ " ");
			
		}
		else {
			arr[i].trim();
			System.out.print(arr[i]+ " ");
			
		}
		
	}
	}
	public static void main(String[] args) {
		ReverseFirstAndLastWord reverseFirstAndLastWord= new ReverseFirstAndLastWord();
		String str= "Welcome to the Technocredits";
		String[] arr=str.split(" ");
		reverseFirstAndLastWord.display(arr);
	}
}
