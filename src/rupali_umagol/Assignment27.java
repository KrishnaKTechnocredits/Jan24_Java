package rupali_umagol;

public class Assignment27 {
	void removeUpper(String input) {
	
		for (int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			boolean flag=Character.isUpperCase(ch);
			if(flag == true) {
				 input=input.replace(ch,'*');
			}	
		}
		String result=input.replace("*","");
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Assignment27 assignment27=new Assignment27();
		assignment27.removeUpper("TechNoCREdits");
	}

}
