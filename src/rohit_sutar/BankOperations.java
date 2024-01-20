package rohit_sutar;

class BankOperations{
	
	int balance = 1000;
	
	void debitAmt(int debitAmount){
		balance = balance - debitAmount;
	}
	
	void creditsAmt(int creditAmount){
		balance = balance + creditAmount;
	}
	
	void printBalance(){
		System.out.println("Your Balance is : "+balance+" Rs.");
	}
	
	public static void main(String args[]){
		BankOperations bankOperations = new BankOperations();
		bankOperations.debitAmt(200);
		bankOperations.creditsAmt(500);
		bankOperations.creditsAmt(200);
		bankOperations.debitAmt(700);
		bankOperations.printBalance();
	}	
}