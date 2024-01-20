package phenol_verma;

/*Assignment - 3 : 16th Jan'2024
Write a program that perform below operations

Init balance is 1000
Create 3 methods [debitAmt, creditsAmt, printBalance]

Inputs :
Debit -> 200
Credit -> 500
Credit -> 200
Debit -> 700

Output :
printBalance -> 800*/

class Assignment3 {
		static int intBalance = 1000;
		
		void debitAmt(int debit){
			intBalance = intBalance - debit;			
		}
		
		void creditsAmt(int cresit){
			intBalance = intBalance + cresit;			
		}
		
		void printBalance(){
			System.out.println("Balance in Account = " + intBalance);	
		}
		
	public static void main(String[] args){
		Assignment3 assignment3 = new Assignment3();
		assignment3.debitAmt(200);
		assignment3.creditsAmt(500);
		assignment3.creditsAmt(200);
		assignment3.debitAmt(700);
		assignment3.printBalance();
		
	}	
}