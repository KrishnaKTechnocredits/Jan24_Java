package pallavi_raut;

/* Assigment 3: Write a program that perform below operations
Init balance is 1000
Create 3 methods [debitAmt, creditsAmt, printBalance]
Inputs :
Debit -> 200
Credit -> 500
Credit -> 200
Debit -> 700
Output :
printBalance -> 800*/

class BalancePrint{
	int balance=1000;
	
	void debitAmt(int num){
		balance=balance-num;//balance=600	
	}
	
	void creditsAmt(int num){
		balance=balance+num;//balance=800	
	}
	
	void printBalance(){
		System.out.println("Balance is : "+ balance);
	}
		
	public static void main (String[] args){
		BalancePrint balancePrint=new BalancePrint();
		balancePrint.debitAmt(400);
        balancePrint.creditsAmt(200);
		balancePrint.debitAmt(750);
        balancePrint.creditsAmt(750);
	    balancePrint.printBalance();
	}	
	  
}




