package sveta;

public class Assignment_29_SumOfEven {

	public static void sumOperation(String str) {
		int sum=0;
		char ch = ' ';
		for(int i=0;i<=str.length()-1;i++) {
			ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				int input=Character.getNumericValue(ch);
				if(input%2!=0) 
					sum+=input;
			}
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		sumOperation("te2chn6ocred8it");
	}

}
