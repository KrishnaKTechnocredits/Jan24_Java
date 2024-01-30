package rupali_umagol;

public class Assignment26 {
	void vowelsRemove(String input) {
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				input = input.replace(ch,'*');
			}
		}
		//System.out.println(input);
		String input1=input.replace("*","");
		System.out.println(input1);
	}
	
	public static void main(String[] args) {
		Assignment26 assignment26=new Assignment26();
		assignment26.vowelsRemove("technocredits");
	}

}
