package akshada_marne;

class BankOperations{
	int balance=1000;
	
	void debitAmt(int num1){
		balance=balance-num1;
	}
	
	void creditsAmt(int num1){
		balance=balance+num1;
	}
	
	void printBalance(){
		System.out.println(balance);
	}
	
	public static void main (String args[]){
		BankOperations bankOperations = new BankOperations();
		bankOperations.debitAmt(200);
		bankOperations.creditsAmt(500);
		bankOperations.creditsAmt(200);
		bankOperations.debitAmt(700);
		bankOperations.printBalance();
	}
	
}