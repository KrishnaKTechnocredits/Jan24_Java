package nikita_patil;


class Example1
{
      int a = 10;
	  int b = 20;
	  
	  public Example1() 
	  {
	        // You can initialize variables or perform any setup here if needed
	    }
	   
	  void m1(){
	      int a = 12;
		  int b=30;
		  Example1 e1= new Example1();
		  Example1 e2= new Example1();
		  //e1.a = 50;
		  e1.a= 100;
		  e1.b=200;
		  e2.a = 300;
		  e2.b=400;
		    
			
			e1.b = e2.a;
		  
		  
		  
		  
		  //System.out.println(e1.b);
		  //System.out.println(e2.a);
		  //System.out.println(e2.b);
		 

		  		  

		  //System.out.println(e.a);
		  //System.out.println(e1.a);
		    //System.out.println(e2.a);
		}
		
	public static void main(String[] args){
		  Example1 e1= new Example1();
         e1.m1();
		//System.out.println(e1.a);
		 		 
     
		}
	}
        



		