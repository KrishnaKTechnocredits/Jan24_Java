package rohit_sutar;

class BankTransactions1{
	int balance = 1000;
	
	void debitAmt(int amt){
		if(amt <= 0){
			System.out.println("Invalid Amount");
			System.out.println();
		}	
		if(amt <= balance){
			balance = balance - amt;
			System.out.println("User Debited : " + amt);
			System.out.println("Current Balance is : " +balance);
			System.out.println();
		}
		else
			System.out.println("Insufficient Balance");
	}
	
	void creditAmt(int amt){
		if (amt < 5000){
			balance = balance + amt;
			System.out.println(balance);
		}
		else
			System.out.println("You can't  deposit more than 5000 rs");
	}
	
	public static void main(String args[]){
		BankTransactions1 bankTransactions1 = new BankTransactions1();
		bankTransactions1.debitAmt(0);
		bankTransactions1.debitAmt(100);
		bankTransactions1.debitAmt(1000);
		
		bankTransactions1.creditAmt(400);
		bankTransactions1.creditAmt(5001);
	}
}