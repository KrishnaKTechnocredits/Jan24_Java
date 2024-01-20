package akshay_gaikwad;

class BankDetail2{

	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(int amt){
		if(amt<=0){
			System.out.println("Invalid amount");
		}else if(amt>balance){
			System.out.println("Insufficient balance");
		}else{
			balance -= amt;
			System.out.println("User debited : " +amt);
			debitCount++;
		}
	}
	
	void creditAmt(int amt){
		if(amt<=0){
			System.out.println("Invalid amount");
		}else if(amt>5000){
			System.out.println("You can't deposite more than 5000 rs in one go");
		}else{
			balance += amt;
			System.out.println("User credited : " +amt);
			creditCount++;
		}
	}
	
	void printStatement(){
		System.out.println("Remaining balance is " + balance);
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Debit method call count -> " + debitCount);
		System.out.println("Credit method call count -> " + creditCount);
		System.out.println("Print Statement method call count -> " + printStatementCount);
	}
	
	public static void main(String[] args){
		
		BankDetail2 bankdetail2 = new BankDetail2();
		
		bankdetail2.debitAmt(-1200);
		bankdetail2.debitAmt(1200);
		bankdetail2.debitAmt(200);
		bankdetail2.printStatement();
		bankdetail2.creditAmt(50000);
		bankdetail2.creditAmt(-500);
		bankdetail2.creditAmt(500);
		bankdetail2.creditAmt(300);
		bankdetail2.creditAmt(500);
		bankdetail2.printStatement();
		bankdetail2.printCountInfo();
	}
}