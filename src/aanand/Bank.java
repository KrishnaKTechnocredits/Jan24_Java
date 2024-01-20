package aanand;

class Bank{
	int balance = 1000;

	void debitAmt(int amount){
		balance = balance - amount;
	}
	
	void creditsAmt(int amount){
		balance = balance + amount;
	}
	
	void printBalance(){
		System.out.println("Balance is " +balance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmt(200);
		bank.creditsAmt(500);
		bank.creditsAmt(200);
		bank.debitAmt(700);
		bank.printBalance();
	}
}