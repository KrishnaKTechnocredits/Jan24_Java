package akshay_gaikwad;

public class Company {
	
	void case1 () {
		Manager manager = new Manager();
		System.out.println(manager.x);
		System.out.println(manager.y);
		//System.out.println(manager.z); (variable z is present in child class so parent can not call it)
		manager.m1();
		manager.m2();
		//manager.m3(); (Method m3 is present in child class so parent can not call it)
		System.out.println("-------------------");
	}
	
	void case2() {
		Employees employees = new Employees();
		System.out.println(employees.x);//(Variable x is present in parent so child can access it)
		System.out.println(employees.y);
		System.out.println(employees.z); 
		employees.m1(); //(Method m1 is present in parent so child can access it)
		employees.m2();
		employees.m3(); 
		System.out.println("-------------------");
	}
	
	void case3() {
		Manager manager = new Employees();
		System.out.println(manager.x); 
		System.out.println(manager.y); //(Properties not does change from compile time to run time so output will be 100)
		//System.out.println(manager.z); (Reference variable of object is Manager (parent) so only those method will work which are present in Manager )
		manager.m1();
		manager.m2(); //(Reference variable of object is Manager (parent) so Complier will look if m2 is present in Manager and compile but behavior of m2 from Employee will take place)  
		//manager.m3(); (Method m3 is present in child class so parent can not call it)
		System.out.println("-------------------");
	}
	
	void case4() {
		//Employees employees = new Manager(); (Object of parent can not be made with child as reference variable. 
	}
	
	void case5() {
		Manager manager = new Manager();
		Employees employees = new Employees();
		manager = employees;
		System.out.println(manager.x); 
		System.out.println(manager.y); //(Properties not does change from compile time to run time so output will be 100)
		//System.out.println(manager.z); (Reference variable of object is Manager (parent) so only those method will work which are present in Manager )
		manager.m1();
		manager.m2(); //(Reference variable of object is Manager (parent) so Complier will look if m2 is present in Manager and compile but behavior of m2 from Employee will take place)  
		//manager.m3(); (Method m3 is present in child class so parent can not call it)
		System.out.println("-------------------");
	}
	
	void case6() {
		Manager manager = new Employees();
		Employees employees = new Employees();
		manager = employees;
		System.out.println(manager.x); 
		System.out.println(manager.y); //(Properties not does change from compile time to run time so output will be 100)
		//System.out.println(manager.z); (Reference variable of object is Manager (parent) so only those method will work which are present in Manager )
		manager.m1();
		manager.m2(); //(Reference variable of object is Manager (parent) so Complier will look if m2 is present in Manager and compile but behavior of m2 from Employee will take place)  
		//manager.m3(); (Method m3 is present in child class so parent can not call it)
		System.out.println("-------------------");
	}
	
	public static void main(String[] args) {
		Company cmp = new Company();
		cmp.case1();
		cmp.case2();
		cmp.case3();
		cmp.case4();
		cmp.case5();
		cmp.case6();
	}
}
