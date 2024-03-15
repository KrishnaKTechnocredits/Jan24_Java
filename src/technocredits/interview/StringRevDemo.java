package technocredits.interview;

public class StringRevDemo {
	
	static String revString(String str) {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}
	
	static String revString1(String str) {
		String output = "";
		for(int index=str.length()-1;index>=0;index--) {
			output += str.charAt(index);
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		System.out.println(StringRevDemo.revString("technocredits"));
	}
}
