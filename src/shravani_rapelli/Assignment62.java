package shravani_rapelli;

public class Assignment62 {
	
	void sumOfNumbersHandleDecimalNum(String str) {
		String output="";
		double db=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)&& str.charAt(i-1)!='.') {
				if(str.charAt(i+1)=='.') {
					output=Character.toString(str.charAt(i))+Character.toString(str.charAt(i+1))
					+Character.toString(str.charAt(i+2));
					db= db+Double.parseDouble(output);
				}
				else {
					db=db+Character.getNumericValue(ch);
				}
			}
		}
		System.out.println(db);
	}
	
	public static void main(String[] args) {
		Assignment62 assign62 = new Assignment62();
		assign62.sumOfNumbersHandleDecimalNum("te3ch4.5noc7red8.1its");
	}

}
