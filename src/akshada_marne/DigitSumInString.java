package akshada_marne;

public class DigitSumInString {
 void calculate(String str) {
	 int sum=0;
	 for(int index=0;index<str.length();index++) {
		 char ch=str.charAt(index);
		 boolean flag=Character.isDigit(ch);
		 
		 int num= Character.getNumericValue(ch);
		 if(flag==true)
		 		 sum=sum+num;
	 }
	 System.out.println(sum);
	 
 }
 
 public static void main(String args[]){
	 DigitSumInString digitSumInString = new DigitSumInString();
	 digitSumInString.calculate("te3ch4nocred8its");
	 digitSumInString.calculate("technocredits");
	 
 }
}
