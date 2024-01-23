package lovekesh_mishra;

class Atm{
	
	    int balance = 1000;
		
		void debitAmt(int amount){
			balance = balance - amount ;		
		}
		
		void creditAmt (int amount){
			balance = balance + amount;		
		}
		
		void printBalance(){
			System.out.println(" current balance -----> " + balance);
		}
		
		public static void main(String[] args){
			Atm atm = new Atm();
			atm.debitAmt(200);
			atm.creditAmt(500);
			atm.creditAmt(200);
			atm.debitAmt(700);
			atm.printBalance();	
		}       
}