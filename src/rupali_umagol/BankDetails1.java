package rupali_umagol;

class BankDetails1{
	
	int balance=1000;
	int  debitCount, creditCount, printStatementCount;
	
	void debitAmt(int amt){
		if (amt > balance){
			System.out.println("Insufficient balance");
		}else if (amt <0){
			System.out.println("Invalid Amount"); 
		}else if(amt <= balance){
			balance=balance - amt;
			System.out.println("User debited : "+ amt);
		}
	}
	void creditAmt(int amt){
		if(amt > 5000){
			System.out.println( "You can't deposite more than 5000 rs in one go" );
		}else if (amt < 0){
			System.out.println("Invalid amount");
		}else{
			balance += amt;
			System.out.println("User credited : " + amt);
		}
	}
	
	public static void main(String[] args){
		BankDetails1 bankdetail1=new BankDetails1();
		bankdetail1.debitAmt(50);
		bankdetail1.debitAmt(-10);
		bankdetail1.creditAmt(50001);
		bankdetail1.creditAmt(100);
	}
}