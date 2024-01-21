/*Assignment - 14 : 21st Jan'2024
On user defined range print first 3 numbers which is divisible by 3 & 4.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36*/
package sveta;

public class Divisible_3_4 {

	public void division(int start, int end) {
		int count=0;
		for(int i=start;i<=end;i++) {
			if(i%3 == 0 && i%4 == 0) {
				System.out.println("First 3 numbers divisible by 3 and 4 is "+i);
				count++;	
			}
			if(count ==3)
				break;
		}
	}
	public static void main(String[] args) {
		Divisible_3_4 div = new Divisible_3_4();
		div.division(10, 500);
	}

}
