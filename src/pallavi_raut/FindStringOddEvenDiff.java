/*Assignment - 29 : 31st Jan'2024

Print difference between sum of all the odd digits and even digits in the given String.

input : te3ch4noc7re9d8its
output : 7
------------------------------------------------------------------------*/
package pallavi_raut;
class FindStringOddEvenDiff{
	
	public static void main(String[] args){
		FindStringOddEvenDiff findStringOddEvenDiff = new FindStringOddEvenDiff();
		findStringOddEvenDiff.printStringOddEvenDigitDiff("te3ch4noc7re9d8its");
		//findStringOddEvenDiff.printStringOddEvenDigitDiff("te2chn6ocred8its");
	}

	int printStringOddEvenDigitDiff(String str){
		int sumOdd=0, sumEven=0, difference=0;
		for(int index=0; index < str.length(); index++){
			char ch= str.charAt(index);
			boolean flag=Character.isDigit(ch);
			if (flag == true){
				int temp= Character.getNumericValue(ch);
				if (temp % 2!= 0){
					sumOdd= sumOdd + temp;
				}
				else{
					sumEven= sumEven+ temp;
				}
				if (sumEven > sumOdd)
					difference=sumEven- sumOdd;
				else{
					difference=sumOdd- sumEven;
				}	
			}
		}
		System.out.println("sum of all the odd digits in '" + str + "' is : "  +difference);
		return difference;
	}		
}