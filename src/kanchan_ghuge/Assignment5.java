package kanchan_ghuge;

class Assignment5{
	int balance = 1000;
	int debitAmt;
	int creditAmt;
	int printStatement;
	
	void debitAmt(int amt){
	    System.out.println("Initial Account Balance =" +balance);
	    this.balance = balance - amt;
	    debitAmt++;
	}
	
	void creditAmt(int amt){
	    this.balance = balance + amt;
	    creditAmt++;
	}
	
	void printStatement(){
	    System.out.println("Remaining Balance = " + balance);
	    printStatement++;
	}

	void printCountInfo(){
	    System.out.println("debit method call count =" + debitAmt);
	    System.out.println("Credit method call count =" + creditAmt);
	    System.out.println("Print Statement method call count =" + printStatement);
	}
	
	public static void main(String [] args){
	    Assignment5 assignmnet5 = new Assignment5();
	    assignmnet5.debitAmt(300);
	    assignmnet5.printStatement();
	    assignmnet5.creditAmt(500);
	    assignmnet5.creditAmt(300);
	    assignmnet5.creditAmt(500);
	    assignmnet5.printStatement();
	    assignmnet5.printCountInfo();
	}
}	
	