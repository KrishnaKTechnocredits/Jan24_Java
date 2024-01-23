package hiral_purohit;

class BankDetails{
	int balance = 1000;
	int debitAmt;
	int creditAmt;
	
	void debitAmt(int amt){
		if (amt > balance){
			//balance = balance;
			System.out.println ("Insufficient balance");
			System.out.println ("Your available balance is " + balance);
			
		} else if (amt <=0){
			System.out.println ("Invalid amount");
		
		}else if (amt <= balance){
			balance = balance - amt;
			System.out.println ("User Debited: " + amt);
			System.out.println ("Your available balance is " + balance);	
		}
	}
	
	void creditAmt(int amt){
		if (amt >= 5000){
			System.out.println("You can't deposite more than 5000 rs in one go");
			
		} else if (amt < 0){
			System.out.println ("Invalid amount");
		}		
	}
	
	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmt(1200);
		bankDetails.debitAmt(500);
		bankDetails.debitAmt(-400);
		bankDetails.creditAmt(5100);
	}
	
}	