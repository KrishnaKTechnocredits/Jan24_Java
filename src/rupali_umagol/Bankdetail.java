package rupali_umagol;

class Bankdetail{
	int balance=1000;
	int  debitCount, creditCount, printStatementCount;
	
	void debitAmt(int amt){
		balance=balance - amt;
		debitCount++;
	}
	void creditAmt(int amt){
		balance += amt;
		creditCount++;
	}
	void printStatement(){
		System.out.println("Print current balance : " + balance);
		printStatementCount++;
	} 
	void printCountInfo(){
		System.out.println("debit method call count -> " + debitCount);
		System.out.println("credit method call count -> " + creditCount);
		System.out.println("printStatement method call count " + printStatementCount);
	}
	
	public static void main(String[] args)
	{
		Bankdetail bankdetail=new Bankdetail();
		bankdetail.debitAmt(300);
        bankdetail.printStatement();
		bankdetail.creditAmt(500);
		bankdetail.creditAmt(300);
		bankdetail.creditAmt(500);
		bankdetail.printStatement();
		bankdetail.printCountInfo();
	}
}