package prathamesh_tati;

//Assignment 6

class BankDetails{
	
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(int amt){
		if(amt > balance){
			System.out.println("Insufficient Balance");
		} else if (amt < 0){
			System.out.println("Invalid amount");
		} else{
			balance = balance - amt;
			debitCount++;
		}
	}
	
		void creditAmt(int amt){
		if(amt > 5000){
			System.out.println("You can't deposite more than 5000 rs in one go");
		} else if(amt < 0){
			System.out.println("Invalid amount");
		} else{
			balance = balance + amt;
		creditCount++;
		}
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
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmt(7000);
		bankDetails.debitAmt(-900);
		bankDetails.debitAmt(300);
        bankDetails.printStatement();
		bankDetails.creditAmt(8000);
		bankDetails.creditAmt(-500);
		bankDetails.creditAmt(500);
		bankDetails.creditAmt(300);
		bankDetails.creditAmt(500);
		bankDetails.printStatement();
		bankDetails.printCountInfo();
	}
}