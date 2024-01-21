package priya_t;

class Example8{

int balance= 1000;  //bY Default 0

 void m1(int amt){
     balance= balance + amt;     //1000+300=1300
   }                             //1300+200=1500
   
  void m2(int amt){
     balance= balance - amt;   //1500-800=700
	 }
	 
  void printbalance(){
    System.out.println(balance);
	
	}
	
	public static void main(String[] args){
	
	Example8 example= new Example8();
	example.m1(300);   
	example.m1(200);   
	example.m2(800);   
	example.printbalance();
	
	}
	}
	
   