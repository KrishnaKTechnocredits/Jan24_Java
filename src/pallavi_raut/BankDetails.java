/*Assignment - 6 : 18th Jan'2024

Rewrite yesterday's BankDetails program with following condition.

1. If debitAmt is more than balance, asked amount should not be deducted from balance and you should print "Insufficient balance". if amount asked is less than equal to balance, then deduct the balance and print "User debited : " + amt. 
If amt asked is negative, print "Invalid amount"

2. If user tries to credit more than 5000 in one go, you should print "You can't deposite more than 5000 rs in one go" and amount should not be credited in main balance. If credited amount is negative, print "Invalid amount".



===============================================================================================================================/*/
package pallavi_raut;
class BankDetails{
	int balance=50000;
	
	void debitAmt(int amount){
		if (amount > balance){
			System.out.println("Insufficient balance. Your current balance is : " + balance);
		}	
		else if(amount <= balance && amount >=0){
			balance=balance-amount;
			System.out.println("User debited : " + amount + ". Your current balance is : " + balance);
		}
		else if(amount < 0){
			System.out.println(+ amount +" is Invalid amount." );	
		}	
	}
	
	void creditAmt(int amount){
		if (amount > 5000){
			System.out.println("You can't deposite more than 5000 rs in one go.");
		}
		else if(amount <= 5000 && amount >=0){
			balance=balance+amount;
			System.out.println("User Credited : " + amount + ". Your current balance is : " + balance);
		}		
		else if(amount < 0){
			System.out.println(+ amount +" is Invalid amount." );	
		}
	}
	
	public static void main (String[] args){
		BankDetails bankDetails= new BankDetails();
		bankDetails.debitAmt(20000);
		bankDetails.creditAmt(20000);
	    bankDetails.debitAmt(-100);
		bankDetails.debitAmt(35000);
		bankDetails.creditAmt(3000);
		bankDetails.creditAmt(-1);
	}
}	