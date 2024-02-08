package technocredits;

public class ArrExample4 {

	public static void main(String[] args) {
		String str = "Hi Hello How Are you";
		String[] arr = str.split(" ");
		System.out.println(arr.length); // 1
		
		String input = "techno credits pune";
		String word = input.split(" ")[0];
		System.out.println(word);
		
		String input1 = "techno credits";
		char ch = input1.split(" ")[1].toUpperCase().charAt(0);
		System.out.println(ch);
	}
}
