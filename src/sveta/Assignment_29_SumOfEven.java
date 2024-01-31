/*
 * Assignment - 29 : 31st Jan'2024

Print difference between sum of all the odd digits and even digits in the given String.

input : te3ch4noc7re9d8its
output : 7

hint : 19 - 12 = 7*/
 
package sveta;

public class Assignment_29_SumOfEven {

	public static void sumOperation(String str) {
		int sum=0, sum1=0;
		char ch = ' ';
		for(int i=0;i<=str.length()-1;i++) {
			ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				int input=Character.getNumericValue(ch);
				if(input%2!=0) {
					sum+=input;
				}else if(input%2==0) 
					sum1+=input;	
			}
		}
		
		System.out.println("sub of "+sum + " and "+sum1+" is "+(sum-sum1));
	}
	public static void main(String[] args) {
		
		sumOperation("te3ch4noc7re9d8its");
	}

}
