package nikita_patil; 

class BankDetail{
     int balance = 1000;
	 int debitcount;
	 int creditcount;
	 int printcount;
	 
	 void DebitAmt(int amt){
	      balance = balance - amt;
		  debitcount++;
		}
	
		
		void CreditAmt(int amt){
		    balance = balance + amt;
			creditcount++;
		}
		
		void  PrintStatement(){
			 System.out.println("Remaining balance is   :"  + balance);
			  printcount++;
		}
           
         void PrintCountInfo(){
          System.out.println("debit method call count  :" + debitcount) ;
		  System.out.println("credit method call count  :"+ creditcount);
		  System.out.println("PrintStatement method call count  :" + printcount);
		  
		 }

		 
    public static void main(String[] args){
         BankDetail b = new BankDetail();
         b.DebitAmt(300);
		 b.PrintStatement();
         b.CreditAmt(500);
         b.CreditAmt(300);	
         b.CreditAmt(500);		  
		 b.PrintStatement();
		 b.PrintCountInfo();
       
	}
}