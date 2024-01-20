package hiral_purohit;

class BankBalance{
	int balance = 1000;
	
	void debiAmt(int amount){
		balance = balance - amount;
		}
	
	void creditsAmt(int amount){
		balance = balance + amount;
	}
	
	void printBalance(){
	System.out.println("printbalance -> " + balance);
	}
	
	public static void main(String[]args){
		BankBalance bankbalance = new BankBalance();
		bankbalance.debiAmt(200);
		bankbalance.creditsAmt(500);
		bankbalance.creditsAmt(200);
		bankbalance.debiAmt(700);
		bankbalance.printBalance();
	}
}