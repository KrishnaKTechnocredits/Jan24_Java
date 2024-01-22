package shraddha;

class Bank{

	int balance=1000;

	void debitAmt(int a){
	
		balance = balance - a;
	}
	
	void creditAmt(int b){
	
		balance = balance + b;
	}
	
	void printBalance(){
	
		System.out.println("Your available balance is: "+balance);
	}
	
	public static void main(String[] args){
		
		Bank bank = new Bank();
		bank.debitAmt(200);
		bank.creditAmt(500);
		bank.creditAmt(200);
		bank.debitAmt(700);
		bank.printBalance();
	}
}