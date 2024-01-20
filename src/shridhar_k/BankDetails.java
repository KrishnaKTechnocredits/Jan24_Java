package shridhar_k;

class BankDetails{
	
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatmentCount;
	
	void debitAmt(int amt){
		if(amt < 0){
			System.out.println("Invalid amount.");
		}else if(amt > balance){
			System.out.println("Insufficient balance");
		}else{
			balance = balance - amt;
			System.out.println("User debited: " + amt);
			debitCount++;
		}
	}
	
	void creditAmt(int amt){
		if(amt > 5000){
			System.out.println("You can't deposit more than 5000 in one go");
		}else if(amt < 0){
			System.out.println("Invalid amount");
		}else{
			balance = balance + amt;
			creditCount++;
		}
	}
	
	void printStatment(){
		System.out.println("Remaining balance is " + balance );
		printStatmentCount++;
	}
	void printCountInfo(){
		System.out.println("debit method call count -> " + debitCount);
		System.out.println("credit method call count -> " + creditCount );
		System.out.println("print Statment call count -> " + printStatmentCount );
	}
	
	public static void main(String[] arg){
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmt(-300);
		bankDetails.debitAmt(3000);
		bankDetails.creditAmt(8005);
		bankDetails.creditAmt(-500);
		bankDetails.creditAmt(0);
		bankDetails.creditAmt(50);
		bankDetails.printStatment();
		bankDetails.printCountInfo();
	}
}