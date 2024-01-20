package phenol_verma;

/*Assignment - 6 : 18th Jan'2024

Rewrite yesterday's BankDetails program with following condition.

Case -1. If debitAmt is more than balance, asked amount should not be deducted from balance and you should print
 "Insufficient balance". if amount asked is less than equal to balance, then deduct the balance and print "User debited : " + amt. 
If amt asked is negative, print "Invalid amount"

Case - 2. If user tries to credit more than 5000 in one go, you should print
 "You can't deposite more than 5000 rs in one go" and amount should not be credited in main balance. If credited amount is negative, print "Invalid amount".*/
 
class BankDetails {
	static int balance = 1000, debitCount, creditCount, printStatementCount;

	void dbtTransaction(int amt){
		if(amt < 0){
			System.out.println("Invalid amount");
		} else if(amt > balance){
			System.out.println("Insufficient balance");
		} else {
			System.out.println("User debited : " + amt);
		}
	}
	
	void crdTransaction(int amt) {
		if(amt > 5000){
			System.out.println("You can't deposite more than 5000 rs in one go");
		} else if (amt < 0){
			System.out.println("Invalid amount");
		} else {
			balance = balance + amt;
			System.out.println("Update balance after credit -> " + balance);
		}
	}
	
	
	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		System.out.println("************Case-1**************");
		bankDetails.dbtTransaction(1001);
		bankDetails.dbtTransaction(500);
		bankDetails.dbtTransaction(-100);
		System.out.println("************Case-2**************");
		bankDetails.crdTransaction(5001);
		bankDetails.crdTransaction(-100);
		bankDetails.crdTransaction(2000);
	}	
} 
