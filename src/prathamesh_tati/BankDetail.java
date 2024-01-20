package prathamesh_tati;

class BankDetail{
	
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(int amt){
		balance = balance - amt;
		debitCount++;
	}
	
	void creditAmt(int amt){
		balance = balance + amt;
		creditCount++;
	}
	
	void printStatement(){
		System.out.println("remaining balance is " + balance);
		printStatementCount++;
	}

	void printCountInfo(){
		System.out.println("debit method call count -> " + debitCount);
		System.out.println("credit method call count -> " + creditCount);
		System.out.println("printstatment method call count -> " + printStatementCount);
		
	}
	
	public static void main(String[] args){
		BankDetail bankDetail = new BankDetail();
		bankDetail.debitAmt(300);
        bankDetail.printStatement();
		bankDetail.creditAmt(500);
		bankDetail.creditAmt(300);
		bankDetail.creditAmt(500);
		bankDetail.printStatement();
		bankDetail.printCountInfo();
	}
}