package shraddha;

class Bank1{
	int balance = 1000;

	void debitAmt(int amt){
		if(amt < 0){
			System.out.println("Invalid Amount: " + amt);
		}
		else if(balance < amt){
			System.out.println("You have insufficient Balance: " + amt);
		}
		else{
			balance = balance - amt;
			System.out.println("User debited : " + amt);
		}
	}
	
	void creditAmt(int amt){
		if(amt < 0){
			System.out.println("Invalid Amount" + amt);
		}
		else if(amt > 5000){
			System.out.println("You can't deposite more than 5000 rs in one go: " + amt);
		}
		else{
			balance = balance + amt;
			System.out.println("Amount Credited : " + amt);
		}
	}
	
	void printBalance(){
	
		System.out.println("Your available balance is: " + balance);
	}
	
	public static void main(String[] args){
		Bank1 bank1 = new Bank1();
		bank1.printBalance();
		bank1.debitAmt(-10);
		bank1.debitAmt(1200);
		bank1.debitAmt(200);
		bank1.creditAmt(-200);
		bank1.creditAmt(6000);
		bank1.creditAmt(5000);
		bank1.printBalance();
	}
}