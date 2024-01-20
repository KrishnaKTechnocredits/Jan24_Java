package shraddha;

class BankDetail{
	
	int balance=1000;
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
		System.out.println("Your available balance is Rs:"+ balance);
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("debit method call count -> "+ debitCount);
		System.out.println("credit method call count -> "+ creditCount);
		System.out.println("printstatment method call count -> "+ printStatementCount); 
	}
	
	public static void main(String[] args){
		BankDetail bank = new BankDetail();
		bank.debitAmt(300);
        bank.printStatement();
		bank.creditAmt(500);
		bank.creditAmt(300);
		bank.creditAmt(500);
		bank.printStatement();
		bank.printCountInfo();
	}
}