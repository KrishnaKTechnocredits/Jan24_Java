package akshada_marne;

class BankDetails{
	int balance = 1000, debitCount, creditCount, printStatementCount;
	
	void debitAmt(int amt){
		if (amt>balance){
			System.out.println("Insufficient balance");
		}
		else if (amt<0){
			System.out.println("Invalid amount");
		}	
		else{
			balance=balance-amt;
			System.out.println("User debited: "+ amt);
		}
	}
	
	void creditAmt(int amt){
		if(amt>5000){
			System.out.println("You can't deposite more than 5000 Rs in one go");
		}
		else if (amt<0){
			System.out.println("Invalid amount");
		}	
		else{
			balance+=amt;
			System.out.println("User credited: "+ amt);
		}
	}
	public static void main (String args[]){
	BankDetails bankDetails = new BankDetails();
	bankDetails.debitAmt(2000);
	bankDetails.debitAmt(-2);
	bankDetails.debitAmt(900);
	bankDetails.creditAmt(6000);
	bankDetails.creditAmt(-20);
	bankDetails.creditAmt(200);
 }
}