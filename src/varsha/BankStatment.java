package varsha;

class BankStatment{
	
	int balance = 1000;

	void debitAmt(int amt){
		if (amt < 0) { 
			System.out.println("Invalid amount");
		} else if (balance < amt) {
			System.out.println("Insuffient Balance");
		} else {
			balance = balance - amt;
			System.out.println("Amount debited : " +  amt);
		}
	}

	void creditAmt(int amt){
		if (amt < 0) {
			System.out.println("Invalid amount");
		} else if (amt > 5000) {
			System.out.println("Your can't deposite more then 5000 rs in one go");
		} else {
			balance = balance + amt;
			System.out.println("Amout credited : " + amt);
		}
	}

	void printInfo(){
		System.out.println("Total balance : " + balance);
	}

	public static void main(String[] args){
		BankStatment bankStatment = new BankStatment();
		bankStatment.debitAmt(-300);
		bankStatment.creditAmt(500);
		bankStatment.creditAmt(5500);
		bankStatment.debitAmt(200);
		bankStatment.debitAmt(1500);
		bankStatment.printInfo();
		bankStatment.creditAmt(3000);
		bankStatment.printInfo();
		bankStatment.creditAmt(-2000);
	}
}
