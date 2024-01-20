package sveta;
class BankDetails{
	int balance,debitCount,creditCount, printCount;
	
	void debitAmt(int amt){
		this.balance = balance - amt;
		debitCount++;
	}
	
	void creditAmt(int amt){
		this.balance = balance + amt;
		creditCount++;
		
	}
	
	void printStatement(){
		System.out.println("remaining balance is : " + balance);
		printCount++;
	}
	
	void printCountInfo(){
		System.out.println("debit method call count -> " + debitCount);
		System.out.println("Credit method call count -> " + creditCount);
		System.out.println("Credit method call count -> " + printCount);
	}
	
	public static void main(String []args){
		//Object creation
		BankDetails bankDetails = new BankDetails();
		//method calling
		bankDetails.debitAmt(300);
		bankDetails.printStatement();
		bankDetails.creditAmt(500);
		bankDetails.creditAmt(300);
		bankDetails.creditAmt(500);
		bankDetails.printStatement();
		bankDetails.printCountInfo();
	}
}