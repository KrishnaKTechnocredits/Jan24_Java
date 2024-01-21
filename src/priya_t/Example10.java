package priya_t;


class Example10{

      String name;
      int balance;
	  
	  void setData(String name,int balance){
	  
	  this.balance=balance;
	  this.name= name;
	  
	  }
	  
	  void debitAmt(int amt){
	 
	   balance = balance - amt;
	  System.out.println(balance);
	  }
	  
	  void creditAmt(int amt){
	  balance +=amt;
	  }
	  
	  void printBalance(){
	  
	  System.out.println(name + " has balance of rs " + balance);
	 
	  }
	  
	 public static void main(String[] args){
		 
	  Example10 example=new Example10();
	  example.setData("Techno",1000);
	  example.debitAmt(800);
	  example.creditAmt(200);
	  
	  Example10 example1=new Example10();
	  example1.setData("Harsh",1000);
	  example1.creditAmt(200);
	  example1.printBalance();
	  
	  
	  }
}