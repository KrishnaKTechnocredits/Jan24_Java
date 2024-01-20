package ankita_s;

class BankDetail{
	int balance = 1000;
	int debitCount, creditCount, printStatementCount;

	void debitAmt(int amt){
		balance = balance-amt;
		debitCount = debitCount + 1;
	}

	void creditAmt(int amt){
		balance = balance + amt;
		creditCount = creditCount + 1;
	}

	void printStatement(){
		System.out.println("Current balance is= " + balance);
		printStatementCount = printStatementCount + 1;
	}

	void printCountInfo(){
		System.out.println("Remaining balance is:- " + balance);
		System.out.println("Here is total count of how many times Debit operation performed-> " + debitCount);
		System.out.println("Here is total count of how many times Credit operation performed-> " + creditCount);
		System.out.println("Here is total count of how many times Print statement operation performed-> " + printStatementCount);
	}

	public static void main (String[] args){
		BankDetail bankdetail= new BankDetail();
		bankdetail.debitAmt(300);
		bankdetail.printStatement();
		bankdetail.creditAmt(500);
		bankdetail.creditAmt(300);
		bankdetail.creditAmt(500);
		bankdetail.printStatement();
		bankdetail.printCountInfo();
	}
}


