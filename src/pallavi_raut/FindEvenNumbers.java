/* Assignment - 10 : 21st Jan'2024

Write only one program having the following methods.
1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
10
12
14 
-------------------------------------------*/
package pallavi_raut;

class FindEvenNumbers{
		
	void PrintEvenNumbers (int startIndex, int endIndex){
		System.out.println("Even numbers are: ");
		for(int count=startIndex; count <=endIndex; count++){
			if (count % 2 == 0){
				System.out.println(count);
			}
		}
	}	
	
	public static void main (String[] args){
		FindEvenNumbers evenmum=new FindEvenNumbers();
		evenmum.PrintEvenNumbers(10,15);
	}
}



