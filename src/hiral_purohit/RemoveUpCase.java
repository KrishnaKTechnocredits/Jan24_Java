package hiral_purohit;

public class RemoveUpCase {
	
	void preocessData(String input) {
		
			for(int index = 0; index < input.length(); index++) {
				char ch = input. charAt(index);
				boolean flag = Character.isUpperCase(ch);
					if(flag == true) {
						String temp =String.valueOf(ch);
						input = input.replace(temp, "*");
					}
			}
			String str = input.replace("*","");
			System.out.print(str);
	}
	
	public static void main(String[] args) {
		new RemoveUpCase().preocessData("TechNoCREdits");
	}
}
