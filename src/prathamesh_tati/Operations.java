package prathamesh_tati;

class Operations{
	
	int balance = 1000;
	
	void debitAmt(int amount){
		balance = balance - amount;
	}
	
	void creditsAmt(int amount){
		balance = balance + amount;
	}
	
	void printBalance(){
		System.out.println("Your Account Balance is = " + balance);
	}
	
	public static void main (String[] args){
		Operations operations = new Operations();
		operations.debitAmt(200);
		operations.creditsAmt(500);
		operations.creditsAmt(200);
		operations.debitAmt(700);
		operations.printBalance();
	}
}