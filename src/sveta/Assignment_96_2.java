/*2. Print all the numbers of Fibonacci series where in series number should not cross 100.*/
package sveta;

public class Assignment_96_2 {

	public void findFebonacci(int no) {
		int no1=0;
		int no2 =1;
		int temp=0;
		
		while(no1<=no) {
			System.out.println(no1);
			temp = no1+no2;
			no1=no2;
			no2=temp;
		}
	}
	
	public static void main(String[] args) {
		new Assignment_96_2().findFebonacci(100);
	}

}
