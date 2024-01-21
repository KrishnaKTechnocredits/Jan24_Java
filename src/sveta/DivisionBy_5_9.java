/* Assignment - 12 : 21st Jan'2024
On user defined range print last number which is divisible by 5 & 9.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 100
Output : Last number divisible by 5 & 9 is 90
*/
package sveta;

public class DivisionBy_5_9 {

	public void Division(int start, int end) {
		int no=0;
		for(int i=start;i<=end;i++) {
			if(i%5 == 0 && i%9 ==0) {
				no=i;
			}
		}
		System.out.println("Last Number divisible by 5 & 9 is "+no);
	}
	public static void main(String[] args) {
		DivisionBy_5_9 div = new DivisionBy_5_9();
		div.Division(5, 100);

	}

}
