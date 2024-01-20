package akshada_marne;

class BankDetail{
	int balance = 1000, debitCount, creditCount, printStatementCount;
	
	void DebitAmt(int amt){
		balance=balance-amt;
		debitCount++;
	}
	void CreditAmt(int amt){
		balance+=amt;
		creditCount++;
	}
	
	void printStatement(){
		System.out.println("remaining balance is "+balance);
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("debit operation count is "+debitCount);
		System.out.println("credit operation count is "+creditCount);
		System.out.println("PrintStatement operation count is "+printStatementCount);
		
	}
    
	public static void main (String args[]){
		BankDetail bankDetail = new BankDetail();
		bankDetail.DebitAmt(300);
        bankDetail.printStatement();
		bankDetail.CreditAmt(500);
		bankDetail.CreditAmt(300);
		bankDetail.CreditAmt(500);
		bankDetail.printStatement();
		bankDetail.printCountInfo();
	}

}