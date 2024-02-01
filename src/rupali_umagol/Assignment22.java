package rupali_umagol;

public class Assignment22 {
	int count;
	
	void calCharacter(String input) {
		for (int index=0; index<input.length(); index++) {
			char str =input.charAt(index);
			boolean flag=Character.isDigit(str);
			if(flag == true ) {
				count++;
			}
		}
		System.out.println("Result :" + count);
	}
	
	public static void main(String[] args) {
		Assignment22 assignment22=new Assignment22();
		assignment22.calCharacter("te3c3hn5o2cre3dits");
	}

}
