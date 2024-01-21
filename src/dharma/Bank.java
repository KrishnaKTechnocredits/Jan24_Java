package dharma;

class Bank{
 
    int balance = 1000;

	void debitAmount(int amount){
		balance = balance - amount;
	}
	
	void creditAmount(int amount){
		balance = balance + amount;
	}
	
	void printBalance(){
		System.out.println("Bank : "+ balance);
	}

	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmount(200);
		bank.creditAmount(500);
		bank.creditAmount(200);
		bank.debitAmount(700);
		bank.printBalance();
	}
}
	
	