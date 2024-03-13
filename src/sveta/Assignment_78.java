/*Assignment - 78 : 9th March'2024

*
**
***
****

1
1 2
1 2 3 
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

1
2 3
4 5 6
7 8 9 10*/
package sveta;

public class Assignment_78 {

	void patternPrint1(int n) {
		for (int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void digitPrint1(int n) {
		for (int i=1;i<=n+1;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
	
	void digitPrint2(int n) {
		int temp=0;
		for (int i=1;i<=n+1;i++) {
			for(int j=1;j<i;j++) {
				temp++;
				System.out.print(temp +" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment_78 assignment78 = new Assignment_78();
		assignment78.patternPrint1(4);
		assignment78.digitPrint1(6);
		assignment78.digitPrint2(4);

	}

}
