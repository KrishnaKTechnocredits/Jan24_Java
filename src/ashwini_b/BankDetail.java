package ashwini_b;

/*Assignment - 5 : 17th Jan'2024

Create a class called BankDetail. Instance variable can be,

balance = 1000, debitCount, creditCount, printStatementCount


1. Method for DebitAmt(int amt), CreditAmt(int amt), printStatement : print current balance, 
printCountInfo : printCountInfo should print,

remaining balance

how many times Debit operation performed

how many times Credit operation performed

how many times PrintStatement operation performed

input : debitAmt(300)
        printStatement()
		creditAmt(500)
		creditAmt(300)
		creditAmt(500)
		printStatement()
		printCountInfo()
		
output : remaining balance is 700
         remaining balance is 2000
         debit method call count -> 1
         credit method call count -> 3
         printstatment method call count -> 2
		 
*/
 
 class BankDetail{
    int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
     void DebitAmt(int amt){
	   debitCount++;
	   balance = balance - amt;  
	  //System.out.println("remaining balance is " + balance);   //balance--700
	 }
	 
	 void creditAmt(int amt){
	   creditCount++;
	   balance = balance + amt;	  
	 // System.out.println("remaining balance is " + balance); //500+300+500
	 }
	 
	 void printStatement(){
	   printStatementCount++;
	   System.out.println("remaining balance is " + balance);  //2000 
	 }
	 
	 void printCountInfo(){
	   System.out.println("debit method call count -> " + debitCount);
	   System.out.println("credit method call count -> " + creditCount );
	   System.out.println("printstatment method call count -> " + printStatementCount);
	 }

     public static void main(String[] args){
	   BankDetail bankDetail = new BankDetail();
	   bankDetail.DebitAmt(300); //700
	   bankDetail.printStatement(); //700
	   bankDetail.creditAmt(500);
	   bankDetail.creditAmt(300);
	   bankDetail.creditAmt(500);
	   bankDetail.printStatement();
	   bankDetail.printCountInfo();
	}
  }	
	  