package bernadette_paul;
class BankTransactions{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
		 
	void debitAmt(int amt){
		this.balance= balance -amt;
		debitCount++;		
	}
	
	void creditAmt(int amt){
		this.balance= balance +amt;
		creditCount++;
	}
	
	void printStatement(){
		System.out.println("Remaining Balance " + balance);
		printStatementCount++;
	}
	
	void countStatement(){
		System.out.println("Debit Count " + debitCount);
		System.out.println("Credit Count " + creditCount);
		System.out.println("PrintStatement Count " + printStatementCount);
	}
	
	public static void main(String[] args){
		BankTransactions bankTransactions = new BankTransactions();
		bankTransactions.debitAmt(300);
		bankTransactions.printStatement();
		bankTransactions.creditAmt(500);
		bankTransactions.creditAmt(300);
		bankTransactions.creditAmt(500);
		bankTransactions.printStatement();
		bankTransactions.countStatement();
	}
}