package shravani_rapelli;

public class Assignment27 {
	
	void removeUppercase(String str) {
		char ch;
		for(int i=0; i< str.length(); i++) {
			ch = str.charAt(i);
			boolean flag = Character.isUpperCase(ch);
			if(flag == true) {
				str=str.replace(ch, '*');
			}
		}
		String temp = str.replace("*","");
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		Assignment27 assign27 = new Assignment27();
		assign27.removeUppercase("TechNoCREdits");
	}

}
