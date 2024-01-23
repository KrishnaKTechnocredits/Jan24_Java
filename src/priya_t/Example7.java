package priya_t;

class Example7{

int balance;  //bY Default 0

 void m1(){
     balance= balance + 100;   //0+100=100
   }
   
  void m2(){
     balance= balance - 50;   //200-50=150
	 }
	 
  void m3(){
    System.out.println(balance);
	
	}
	
	public static void main(String[] args){
	
	Example7 example= new Example7();
	example.m1();   //100
	example.m1();   //100+100=200
	example.m2();   //200-50=150
	example.m3();
	
	}
	}
	
   