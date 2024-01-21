package shramika_vaidya;

class BankDetail1{
	int balance = 1000;
	
	void debitAmt(int debitedAmt){
		if(debitedAmt <= balance && debitedAmt > 0){
			balance = balance - debitedAmt;
			System.out.println("User debited :" + debitedAmt);
			System.out.println("Remaining Balance is : " + balance);
		}
	    else if(debitedAmt < 0){
			System.out.println("Invalid Amount");
		}
		else if( debitedAmt >= balance){
          	System.out.println("Insufficient Balance");
		}
	}
 
	void creditAmt(int creditedAmt){
		if(creditedAmt > 5000){
			System.out.println("You cant deposit more than 5000 in one go");
		}
		if(creditedAmt < 0){
			System.out.println("Invalid Amount");
		}
	}
	
	public static void main(String[] args){
		BankDetail1 bankdetail1 = new BankDetail1();
		bankdetail1.creditAmt(-200);
		bankdetail1.debitAmt(300);
		bankdetail1.creditAmt(5500);
		bankdetail1.debitAmt(1100);
		bankdetail1.debitAmt(-800);
	}
}