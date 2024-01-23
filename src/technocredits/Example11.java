package technocredits;

// Test multiple object knowledge with local and instance variable
class Example11{
	int balance;
	String name;
	
	void setData(int balance, String name){
		this.balance = balance;
		this.name = name;
	}
	
	void debitAmt(int amt){
		System.out.println(balance);
//		int balance = balance - amt;
		System.out.println(balance);
	}
	
	void creditAmt(int amt){
		balance += amt;
	}
	
	void printBalance(){
		System.out.println(name + " has balance of rs " + balance);
	}
	
	public static void main(String[] args){
		Example11 example11_1 = new Example11();
		example11_1.setData(1000, "Maulik");
		example11_1.debitAmt(800);
		example11_1.creditAmt(200);
		
		Example11 example11_2 = new Example11();
		example11_2.setData(1000, "Harsh");
		example11_2.creditAmt(200);
		
		example11_1.printBalance();	
	}
}