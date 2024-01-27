package sveta;

public class Assignment_18_ReverseString {

	char c;
	public void reverseStr(String str) {
		for(int i= str.length()-1;i>=0;i--){
			c=str.charAt(i);
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		Assignment_18_ReverseString rstr = new Assignment_18_ReverseString();
		rstr.reverseStr("techno");
		

	}

}
