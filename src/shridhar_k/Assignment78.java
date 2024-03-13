//problem1
//*
//**
//***
//****
//problem2
//1
//1 2
//1 2 3 
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//problem3
//1
//2 3
//4 5 6
//7 8 9 10
package shridhar_k;

public class Assignment78 {
	void printStarPattaern(int numOfRow) {
		for(int i=0;i <= numOfRow; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	void printNumInRow(int numOfRow) {
		for(int i=0;i<=numOfRow;i++) {
			for(int j =0; j<=i;j++) {
				System.out.print(j+1 + " ");
			}
			System.out.println("");
		}
	}
	
	void printNumInSeriesPattern(int num) {
		int count =1;
		for(int i =0;i<=num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count + " ");
				count++;
				if(count == num+1) {
					break;
				}
			}
			System.out.println("");
			if(count == num+1) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
	Assignment78 a = new Assignment78();
		a.printStarPattaern(4);
		System.out.println("");
		a.printNumInRow(4);
		System.out.println("");
		a.printNumInSeriesPattern(10);
	}
}
