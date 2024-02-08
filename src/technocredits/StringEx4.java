package technocredits;

public class StringEx4 {
	
	public static void main(String[] args) {
		String str = "technocredits";
		
		
		//str = str.replace('t','*');
		//str = str.replace("t", "");
		//System.out.println(str); // *nocredits
		
		
		//char ch = 't';
		//str = str.replace(String.valueOf(ch), "");
		
		str = str.replaceFirst("t", "*");
		System.out.println(str);
		
	}
}
