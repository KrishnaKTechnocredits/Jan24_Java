package aanand;

class BankDetail{
	int balance = 1000, debitCount, creditCount, printStatementCount;
	
	void debitAmt(int amt){
		if(amt > balance){
			System.out.println("Insufficient balance");
		} else if(amt <= 0){
			System.out.println("Invalid amount");
		} else if(amt <= balance){
			balance = balance - amt;
			System.out.println("User debited :		" + amt);
			debitCount++;
		}
	}
	
	void creditAmt(int amt){
		if(amt > 5000){
			System.out.println("You can't deposite more than 5000 rs in one go");
		} else if(amt <= 0){
			System.out.println("Invalid amount");
		} else{
			balance = balance + amt;
			System.out.println("Credited amount is:		" + amt);
			creditCount++;
		}
	}
	
	void printStatement(){
		System.out.println("remaining balance is :		" + balance);
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("debit method call count ->		" + debitCount);
		System.out.println("credit method call count ->		" + creditCount);
		System.out.println("printstatment method call count ->	" + printStatementCount);
	}
	
	public static void main(String[] args){
		BankDetail bankDetail = new BankDetail();
		bankDetail.debitAmt(300);
		bankDetail.debitAmt(500);
		bankDetail.debitAmt(1500);
		bankDetail.debitAmt(-5);
		bankDetail.printStatement();
		bankDetail.creditAmt(500);
		bankDetail.creditAmt(8000);
		bankDetail.creditAmt(-7);
		bankDetail.creditAmt(300);
		bankDetail.creditAmt(500);
		bankDetail.printStatement();
		bankDetail.printCountInfo();
	}
}