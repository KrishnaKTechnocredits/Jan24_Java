package shravani_rapelli;

public class Assignment67_1 {
	
		String reverseWord(String input) {
			String str="";
			for(int i=input.length()-1; i>=0; i--) {
				char ch = input.charAt(i);
				str = str + ch;
			}
			return str;
		}
		
		void printReversedString(String[] rev) {
			String result="";
			String temp="";
			for(int i=0;i<rev.length;i++) {
				temp = reverseWord(rev[i]);
				result = result + temp +" ";
			}
			System.out.println(result.trim());
		}
		
		public static void main(String[] args) {
			Assignment67_1 assg67_1 = new Assignment67_1();
			String input = "Hi Hello Maulik";
			String[] arr = input.split(" ");
			assg67_1.printReversedString(arr);
		}
		
		

}
