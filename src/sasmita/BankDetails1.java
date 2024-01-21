package sasmita;

class BankDetails1{
	
	int balance = 1000;
	int DebitAmt;
	int CreditAmt;
	
	void DebitAmt(int amt){
		 if (amt > balance){
			 System.out.println("Insufficient Balance");
	     } else if(amt <= 0){
			 System.out.println("Invalid amount");
		 } else if(amt <= balance){
			 System.out.println("User debited : " + amt);
		 }
     }
	 
	 void CreditAmt(int amt){
		 if(amt > 5000){
			 System.out.println("You can't deposite more than 5000 rs in one go");
		 } else if(amt <= 0){
			 System.out.println("Invalid amount");
		 }
	 }
	 
	 public static void main(String[]args){
		 BankDetails1 bankDetails1 = new BankDetails1();
		 bankDetails1.DebitAmt(3000);
		 bankDetails1.DebitAmt(-50);
		 bankDetails1.DebitAmt(500);
		 bankDetails1.CreditAmt(6000);
		 bankDetails1.CreditAmt(-100);
	 }
}