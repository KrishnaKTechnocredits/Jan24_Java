package technocredits;

public class CharacterEx1 {

	
	public static void main(String[] args) {
		String str = "TechNoCREdits";
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isUpperCase(ch);
			if(flag == true)
				System.out.println(ch);
		}
		
	}
}
