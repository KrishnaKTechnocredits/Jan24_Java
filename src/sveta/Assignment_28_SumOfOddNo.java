/*Print sum of all the odd digits in the given String.

input : te3ch4noc7red8its
output : 10

input : te2chn6ocred8its
output : 0*/
  package sveta;


public class Assignment_28_SumOfOddNo {

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
