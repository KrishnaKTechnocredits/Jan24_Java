package akshada_marne;

public class Client {
		
		static void case1() {
		Manager manager = new Manager();
		
		System.out.println("------Case1 output------");
		
		System.out.println(manager.x);
		
		System.out.println(manager.y);
		
		//System.out.println(manager.z); (variable z is present in child class so parent can not call it)
		
		manager.m1();
		
		manager.m2();
		
		//manager.m3(); (Method m3 is present in child class so parent can not call it)
		}
	
		void case2() {
			Emp emp= new Emp();
			
			System.out.println("------Case2 output------");
			
			System.out.println(emp.x);//(Variable x is inherited to child by parent. Hence child can use it)
			
			System.out.println(emp.y);
			
			System.out.println(emp.z);
			
			emp.m1();//(Method m1() is inherited to child by parent. Hence child can use it)
			
			emp.m2();
			
			emp.m3();
		}
		
		void case3() {
			Manager manager=new Emp();		
			//Compiler is taking guarantee from reference type i.e. parent)
			
			System.out.println("------Case3 output------");
			
			System.out.println(manager.x);//Since x is present at parent only, the same will get printed here.
			
			System.out.println(manager.y);//y is present at parent & child also. Since properties do not take part in runtime polymorphism, value of y will be taken from parent)
			
			//System.out.println(manager.z);//Since z is not present at parent, it will throw compilation error.
			
			manager.m1();//Since m1() is present at parent only, the same will get printed here.
			
			manager.m2();//m2() is present at parent & child also. Since behavior takes part in runtime polymorphism, m2() from child will get called here
			
			//manager.m3();//Since m3() is not present at parent, it will throw compilation error.
		}
	
		void case4() {
			
		//	Emp emp=new Manager();// Assignment of parent object to hild reference is not allowed. Hence compilation error
			
			System.out.println("------Case4 output------");
		}
		
		void case5() {
			Manager manager=new Manager();
			Emp emp= new Emp();
			
			manager=emp; // This will result in Manager manager=new Emp(); //Compiler is taking guarantee from reference type i.e. parent)
			
			System.out.println("------Case5 output------");
			
			System.out.println(manager.x);//Since x is present at parent only, the same will get printed here.
			
			System.out.println(manager.y);//y is present at parent & child also. Since properties do not take part in runtime polymorphism, value of y will be taken from parent)
			
			//System.out.println(manager.z);//Since z is not present at parent, it will throw compilation error.
			
			manager.m1();//Since m1() is present at parent only, the same will get printed here.
			
			manager.m2();//m2() is present at parent & child also. Since behavior takes part in runtime polymorphism, m2() from child will get called here
			
			//manager.m3();//Since m3() is not present at parent, it will throw compilation error.
		}
	 
		
		void case6() {
			
			Manager manager=new Emp();
			Emp emp= new Emp();
			
			manager=emp; // This will result in Emp emp= new Emp();
			
			System.out.println("------Case6 output------");
			
			System.out.println(emp.x);//(Variable x is inherited to child by parent. Hence child can use it)
			
			System.out.println(emp.y);
			
			System.out.println(emp.z);
			
			emp.m1();//(Method m1() is inherited to child by parent. Hence child can use it)
			
			emp.m2();
			
			emp.m3();
		}

		public static void main(String args[]) {
			Client client = new Client();
			
			
			client.case1();
			client.case2();
			client.case3();
			client.case4();
			client.case5();
			client.case6();
}
}