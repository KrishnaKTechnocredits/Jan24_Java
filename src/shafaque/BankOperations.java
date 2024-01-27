package shafaque;

class BankOperations
{
   int balance =1000;
   
   void debitamt(int num1)
   {
    balance = balance - num1;
   }
   
   void creditamt(int num1)
   {
    balance = balance + num1;
   }
   
   void printbalance()
   {
    System.out.println(balance);
   }
   
   public static void main(String[] args)
   {
    BankOperations bankoperations = new BankOperations();
	bankoperations.debitamt(200);
	bankoperations.creditamt(500);
	bankoperations.creditamt(200);
	bankoperations.debitamt(700);
	bankoperations.printbalance();
	
   }
}
