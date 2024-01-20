package rupali_umagol;

class BankDetails{

int balance=1000;

	void debitAmt(int amt){
		balance = balance - amt ;
	}
	void creditAmt(int amt){
		balance =  balance + amt;
	}
	void printBalance(){
		System.out.println("Bank Balance : " + balance);
	}
	
	public static void main(String[] args){
		BankDetails bankDetails =new BankDetails();
		bankDetails.debitAmt(200);
		bankDetails.creditAmt(500);
		bankDetails.creditAmt(200);
		bankDetails.debitAmt(700);
		bankDetails.printBalance();	
	}
}