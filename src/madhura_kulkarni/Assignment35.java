/*Assignment - 35 : 4th Feb'2024

Return the sum of even numbers from the array

input : {3, 6, 9, 11, 15, 20, 4, 26}
Output : 60

hint 6, 20, 4, 26*/

package madhura_kulkarni;

public class Assignment35 {

	void getSumOfEvenNumbers(int[] input) {
int sum=0;
for(int i=0;i<input.length;i++)
{
	if(input[i]%2==0)
		sum=sum+input[i];
}
System.out.println("Sum of even numbers in string is : "+sum);
	}

	public static void main(String[] args) {
		int[] arr = { 3, 6, 9, 11, 15, 20, 4, 26 };
		Assignment35 ass = new Assignment35();
		ass.getSumOfEvenNumbers(arr);
	}

}
