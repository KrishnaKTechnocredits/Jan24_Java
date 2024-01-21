package shramika_vaidya;

class Atm{
	int Balance = 1000;
	
	void debitAmt( int debitedAmt){
		Balance = Balance - debitedAmt;
	}
	
	void creditAmt( int creditedAmt){
		Balance = Balance + creditedAmt;
	
	}
	
	void printRemaningBalance(){
		System.out.println("PrintBalance->  " + Balance);
	}
	
	public static void main( String[] args){
		Atm atm = new Atm ();
		atm.debitAmt(200);
		atm.creditAmt(500);
		atm.creditAmt(200);
		atm.debitAmt(700);
		atm.printRemaningBalance();
	
	}
}
		
	
	