package nisarg_patel;

class Assignment3BankDetails{
	int balance = 1000;
	
	void debitAmount(int amount){
		balance = balance - amount;
	}
	
	void creditAmount(int amount){
		balance = balance + amount;
	}
	
	void printBlance(){
		System.out.println("Bank Balance = " + balance);
	}
	
	public static void main(String[] args){
		Assignment3BankDetails assignment3BankDetails = new Assignment3BankDetails();
		assignment3BankDetails.debitAmount(300);
		assignment3BankDetails.debitAmount(200);
		assignment3BankDetails.creditAmount(500);
		assignment3BankDetails.creditAmount(100);
		assignment3BankDetails.printBlance();
	}
}