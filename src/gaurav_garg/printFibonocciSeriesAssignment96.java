/*
 * Assignment - 96 : 25th March'2024 [45-50 mins] 
1. Print Fibonacci series for n elements.
input : 10
output : 0,1,1,2,3,5,8,13,21,34

2. Print all the numbers of Fibonacci series where in series number should not cross 100.
input : 100
output : 0,1,1,2,3,5,8,13,21,34,55,89 

3 Return all the numbers of Fibonacci series between 50 to 100.
output : 55,89 

 */
package gaurav_garg;

public class printFibonocciSeriesAssignment96 {

	void printFibonociseriousForNthElement(int n) {
		int a = 0;
		int b = 1;
		System.out.print("Print the Fibonocci serios -: ");
		System.out.print(a + "," + b);
		for (int j = 3; j <= n; j++) {
			int c = a + b;
			System.out.print("," + c);
			a = b;
			b = c;
		}
	}

	void printFibonociseriousWhichNotCrossed(int n) {
		int a = 0;
		int b = 1;
		System.out.println();
		System.out.print("Print the Fibonocci serios which should be less than " + n + "  -: ");
		System.out.print(a + "," + b);
		int c = a + b;
		while (c <= n) {
			c = a + b;
			a = b;
			b = c;
			if (c > n) {
				break;
			}
			System.out.print("," + c);
		}
	}

	void printFibonociseriousWhichBetweenCrossed(int h,int n) {
		int a = 0;
		int b = 1;
		System.out.println();
		System.out.print("Print the Fibonocci serios which should be between than " + h + " and "+n+" -: ");		
		int c = a + b;
		if(h==1)
		{
			System.out.print(a + " " + b +" "+ b);	
		}
		while (c <= n) {
			c = a + b;
			a = b;
			b = c;
			
			if(c>h && c<n)
			{
				System.out.print(" " + c);
			}
			
		}
	}
	public static void main(String[] args) {
		new printFibonocciSeriesAssignment96().printFibonociseriousForNthElement(10);
		new printFibonocciSeriesAssignment96().printFibonociseriousWhichNotCrossed(100);
		new printFibonocciSeriesAssignment96().printFibonociseriousWhichBetweenCrossed(50,100);
	}
}
