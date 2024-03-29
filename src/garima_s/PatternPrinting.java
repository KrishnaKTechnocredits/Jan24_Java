/* Write a Program to Print a Following Patterns:
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
7 8 9 10
*/

package garima_s;

public class PatternPrinting {
	void printPatternStar() {
		for(int i=0;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
	}	
	
	void printPattern() {
		int count=1;
		for(int i=0;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}System.out.println();
		}
	}
	
	void printPatternNumber() {
		for(int i=0;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PatternPrinting patternPrinting=new PatternPrinting();
		patternPrinting.printPatternStar();
		patternPrinting.printPatternNumber();
		patternPrinting.printPattern();
	}
}
