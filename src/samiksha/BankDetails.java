package samiksha;

class BankDetails{
    
	int balance = 1000;
	int debitCount,creditCount,printStatementCount;
	
	void debitAmt(int amt){
		balance = balance - amt;
		debitCount++;
	}
	void creditAmt(int amt){
		balance = balance + amt;
		creditCount++;
	}
	void printStatement(){
		System.out.println("Current balance is " + balance);
		printStatementCount++;
	}
	void printCountInfo(){
		System.out.println("debitCount is " + debitCount);
		System.out.println("creditCount is " + creditCount);
		System.out.println("print statement count is " + printStatementCount);
	}
	public static void main(String[] args){
		BankDetails bankDetals = new BankDetails();
		bankDetals.debitAmt(300);
		bankDetals.printStatement();
		bankDetals.creditAmt(500);
		bankDetals.creditAmt(300);
		bankDetals.creditAmt(500);
		bankDetals.printStatement();
		bankDetals.printCountInfo();
    }
}