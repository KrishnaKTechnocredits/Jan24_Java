package nisarg_patel;

class Assignment6BankTransaction{
	
	int blance = 1000;
	
	void debitAmt(int amt){
		
		if (amt > blance){
			System.out.println("Insufficient Balance");
		}
		
		else if (amt <= 0){
			System.out.println("Invalid Amount");
		}
		
		else if (amt <= blance){
			
			blance = blance - amt;
			System.out.println("User Debit Amount : " + amt + "Bank Blance Amount : " + blance);
		}
	}
	
	void creditAmt(int amt){
		if (amt > 5000){
			System.out.println("You can't deposite more than Rs:5000");
		}
		
		else if (amt <= 0){
			System.out.println("Invalid Amount");
		}
		
		else{
			blance = blance + amt;
			System.out.println("User Credit Amount : " + 3000 + "Bank Blance Amount : " + blance);
		}
	}
	
	public static void main(String[] args){
		Assignment6BankTransaction assignment6BankTransaction = new Assignment6BankTransaction();
		assignment6BankTransaction.debitAmt(3000);
		assignment6BankTransaction.debitAmt(-100);
		assignment6BankTransaction.debitAmt(500);
		assignment6BankTransaction.creditAmt(7000);
		assignment6BankTransaction.creditAmt(200);
		assignment6BankTransaction.creditAmt(-100);
	}
}