package lovekesh_mishra;

class BankInfo {
	       int balance = 1000;
		   int debitCount;
		   int creditCount;
		   int printStatementCount;
		   
		   void debitAmt(int amt){
			   this.balance= balance-amt;
			   debitCount++;	   
		   }
		   
		   void creditAmt(int amt){
			   this.balance= balance+amt;
			   creditCount++;   
		   }
		   
		   void printStatement(){
			   System.out.println("current balance- " +balance);
			   printStatementCount++;
		   }
		   
		   void countStatement(){
			   System.out.println("debitCount is - " + debitCount);
			   System.out.println("creditCount is - " + creditCount);
			   System.out.println("printStatementCount is - " + printStatementCount); 
		   }
		   
		   public static void main(String[] args){
			   BankInfo bankInfo = new BankInfo();
			   bankInfo.debitAmt(300);
		       bankInfo.printStatement();
			   bankInfo.creditAmt(500);
			   bankInfo.creditAmt(300);
			   bankInfo.creditAmt(500);
			   bankInfo.printStatement();
			   bankInfo.countStatement();
		   }
}