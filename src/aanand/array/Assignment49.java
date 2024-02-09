package aanand.array;

public class Assignment49 {

	void getLastCharOfWord(String str) {
		String[] arr = str.split(" ");
		for(int i = 0; i < arr.length; i++) {
			char ch = str.charAt(i);
			if(ch == ' ') {
							}
		}
		System.out.println();
	}
		
	String getNumberInString(String str) {
		String ans="";
		for(int i =0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!Character.isDigit(ch)) {
				ans = ans + ch;
				
	}
	}
		
		return ans;
	}
	
	void print(String str) {
		String output = getNumberInString(str);
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		Assignment49 assignment49 = new Assignment49();
		assignment49.print("H2i H3el4lo P4un2e5");
		
	}
}
