package samiksha;

class Bank{
   int amount=1000;
   
   void debitAmt(int amt){
      amount = amount-amt;
   }
   void creditAmt(int amt){
      amount= amount+amt;
   }
   void printBalance(){
      System.out.println("The total amount is " + amount);
   }
    public static void main(String[] args){
	  Bank bank=new Bank();
	  bank.debitAmt(200);
	  bank.creditAmt(500);
	  bank.creditAmt(200);
	  bank.debitAmt(700);
	  bank.printBalance();
	}
}
 