package nikita_patil;
class Bank{
       int balance = 1000;
	   
	   void debitAmt(int amt){
	       balance = balance - amt;
		}
		
		void creditsAmt(int amt){
		   balance = balance + amt;                                 
		  
		}
		 
		 void printBalance(){
		     System.out.println("printBalance :  " + balance);
	     }
		 
	public static void main(String[] args){
	    Bank b = new Bank();
		b.debitAmt(200);
		b.creditsAmt(500);
		b.creditsAmt(200);
	    b.debitAmt(700);
		b.printBalance();
	}
}