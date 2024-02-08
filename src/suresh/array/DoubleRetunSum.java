/*
 
Return the sum of all given array of double type.

input :{10.20, 45.50, 34.65, 20.60, 25.46, 78.90}
Output : 215.31 
  
 */

package suresh.array;

public class DoubleRetunSum
{
	void sumOfAll(double[] input) {
		double sum=0;
		for (int i = 0;i<input.length; i++) {
			sum=sum+input[i];
			
		}System.out.println(sum);

	}

	public static void main(String[] args) {

		 DoubleRetunSum  doubleRetunSum = new  DoubleRetunSum();
		double arr[] = {10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		 doubleRetunSum.sumOfAll(arr);
	}

}


