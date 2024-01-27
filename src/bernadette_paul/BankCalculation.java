package bernadette_paul;
class BankCalculation{
		int balance=1000;
		
		void debitAmt(int num1){
			balance = balance - num1;
			
		}
		
		void creditsAmt(int num2){
			balance = balance + num2;
			
	
		}
		void printBalance(){
			System.out.println(balance);
	
		}
		
		public static void main(String[] args){
			
			BankCalculation bankCalculation = new BankCalculation();
			bankCalculation.debitAmt(200);
			bankCalculation.creditsAmt(500);
			bankCalculation.creditsAmt(200);
			bankCalculation.debitAmt(700);
			bankCalculation.printBalance();
		}


}



