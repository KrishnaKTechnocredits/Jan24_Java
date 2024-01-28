/*Assignment - 21 : 27th Jan'2024

Find out the minimum numbers required to create sum 150,
 consider only those numbers which is divisible by 6.
output : 7 */
package sveta;

public class Assignment_21_CountNo {

	public static void sumNo() {
		int count = 0;
		int i=1;
		int sum=0;
		while(sum<150) {
			if(i%6==0) {
				//System.out.println(i);
				sum+=i;
				count++;
			}
			i++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		sumNo();

	}

}
