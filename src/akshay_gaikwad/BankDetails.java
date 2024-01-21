package akshay_gaikwad;

class BankDetails{

	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(int amt){
		balance -= amt;
		debitCount++;
	}
	
	void creditAmt(int amt){
		balance += amt;
		creditCount++;
	}
	
	void printStatement(){
		System.out.println("Remaining balance is " + balance);
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Debit method call count -> " + debitCount);
		System.out.println("Credit method call count -> " + creditCount);
		System.out.println("Print Statement method call count -> " + printStatementCount);
	}
	
	public static void main(String[] args){
		
		BankDetail bankdetail = new BankDetail();
		
		bankdetail.debitAmt(300);
		bankdetail.printStatement();
		bankdetail.creditAmt(500);
		bankdetail.creditAmt(300);
		bankdetail.creditAmt(500);
		bankdetail.printStatement();
		bankdetail.printCountInfo();
	}
}