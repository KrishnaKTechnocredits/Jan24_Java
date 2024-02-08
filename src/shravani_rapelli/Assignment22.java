package shravani_rapelli;

public class Assignment22{
	
	void findDigits(String str) {
		int count=0;
		for(int index=0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isDigit(ch);
			if(flag == true) {
				count++;
			}
		}
		System.out.println("Result:"+ count);
			
	}
	
	public static void main(String[] args) {
		Assignment22 assign22 = new Assignment22();
		assign22.findDigits("te3c3hn5o2cre3dits");
	}
}
