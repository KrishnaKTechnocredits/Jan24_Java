package apurva_arole;

public class Assignment1 {
	  void add(int num1,int num2){
		  
		    int add=num1+num2;
			    System.out.println("num1 is" + num1+" ,num2 is" +num2 +", add=" +add);
		  }
		  void sub(int num1,int num2){
			  
		    int sub=num1-num2;
			    System.out.println("num1 is" + num1+" ,num2 is" +num2 +", sub=" +sub);
		  }
		  void div(int num1,int num2){
			
		    int div=num1/num2;
			    System.out.println("num1 is" + num1+" ,num2 is" +num2 +", div=" +div);
		  }
		  void mul(int num1,int num2){
			
		    int mul=num1*num2;
			    System.out.println("num1 is" + num1+" ,num2 is" +num2 +", mul=" +mul);
		  }
		  public static void main(String[] args){
			    Assignment1 assignment1= new Assignment1();
			    assignment1.add(20,30);
			    assignment1.sub(50,22);
			    assignment1.div(200,10);
			    assignment1.mul(50,5);
		  }
	}

