/*Assignment - 36 : 4th Feb'2024

Return the sum of all the numbers which are divisible by 3 or 5.

input : {6, 5, 3, 15, 19, 40, 30, 27, 11}
Output : 126

Div by 3 : 6+3+27 = 36
Div by 5 : 5+40 = 45
div by both(OR condition) : 15+30 = 45*/

package madhura_kulkarni;

public class Assignment36 {

	void getSumOfEvenNumbers(int[] input) {
int sum=0;
for(int i=0;i<input.length;i++)
{
	if(input[i]%3==0 || input[i]%5==0)
		sum=sum+input[i];
}
System.out.println("Sum of numbers in string that are divisible by 3 or 5 is : "+sum);
	}

	public static void main(String[] args) {
		int[] arr = {6, 5, 3, 15, 19, 40, 30, 27, 11};
		Assignment36 ass = new Assignment36();
		ass.getSumOfEvenNumbers(arr);
	}

}
