package shravani_rapelli;

class ATM{
	
	int balance = 1000;
	
	void creditAmount(int amount){
		balance = balance + amount;
	}
	
	void debitAmount(int amount){
		balance = balance - amount;
	}
	
	void displayTotalBalance(){
		System.out.println(balance);
	}
	
	public static void main(String[] args){
		ATM atm = new ATM();
		atm.creditAmount(500);
		atm.debitAmount(200);
		atm.debitAmount(100);
		atm.creditAmount(400);
		atm.displayTotalBalance();
	}
	
}