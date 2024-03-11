package ashwini_b;
/*
 "Write down all 6 cases of Inheritance using Manager and Employee class.
class Manager{

}
class Employee{

}
class Test{
        void case3(){
                Manager mng = new Employee();
                mng.x;
                mng.y;
                //sop(mng.z); [mng can access only those variables which are available in Manager class becase Manger is a refere type]
        } 
}"
 */

class Manager {
	int x = 10;
	int y = 20;

	void m1() {
		System.out.println("Manager m1");
	}

	void m2() {
		System.out.println("Manager m2");
	}
}

class Employee1 extends Manager{
	int y = 100;
	int z = 200;

	void m2() {
		System.out.println("Employee m2");
	}

	void m3() {
		System.out.println("Employee m3");
	}
}

public class Assgn68_inheritance_6cases {

	void case1() {
		Manager mgr = new Manager();
		System.out.println(mgr.x); // 10
		System.out.println(mgr.y); // 20
		// System.out.println(mgr.z); //CE

		mgr.m1(); // Manager m1
		mgr.m2(); // Manager m2
		// mgr.m3(); //CE

	}

	void case2() {
		Employee1 emp = new Employee1();
		System.out.println(emp.x); // 10
		System.out.println(emp.y); // 100
		System.out.println(emp.z); // 200

		emp.m1(); // Manager m1
		emp.m2(); // Employee m2
		emp.m3(); // Employee m3

	}
	
	void case3() {
		Manager mgr = new Employee1();
		System.out.println(mgr.x); // 10
		System.out.println(mgr.y); // 20
		//System.out.println(mgr.z); // CE 

		mgr.m1(); // Manager m1
		mgr.m2(); // Employee m2
		//mgr.m3(); // CE 


	}

	void case4() {
		//Employee emp = new Manager();  //Type mismatch: cannot convert from Manager to Employee.
		
	}
	
	void case5() {
		Manager mgr = new Employee1();
		Employee1 emp = new Employee1();
		mgr =emp;
		
		System.out.println(mgr.x);
		System.out.println(mgr.y);
		//System.out.println(mgr.z);  //CE z cannot be resolved or is not a field

		mgr.m1();
		mgr.m2();
		//mgr.m3();    //CE The method m3() is undefined for the type Manager

	}
	
	void case6() {
		Manager mgr = new Employee1();
		Employee1 emp = new Employee1();
		//emp = mgr ;  //Type mismatch: cannot convert from Manager to Employee
		
		System.out.println(mgr.x);
		System.out.println(mgr.y);
		//System.out.println(mgr.z); //z cannot be resolved or is not a field

		mgr.m1();
		mgr.m2();
		//mgr.m3();    //The method m3() is undefined for the type Manager
	}
	
	public static void main(String[] args) {
		Assgn68_inheritance_6cases assgn69_inheritance_6cases = new Assgn68_inheritance_6cases();
		System.out.println("----Case 1----");
		assgn69_inheritance_6cases.case1();
		
		System.out.println("----Case 2----");
		assgn69_inheritance_6cases.case2();
		
		System.out.println("----Case 3----");
		assgn69_inheritance_6cases.case3();
		
		System.out.println("----Case 4----");
		assgn69_inheritance_6cases.case4();
		
		System.out.println("----Case 5----");
		assgn69_inheritance_6cases.case5();
		
		System.out.println("----Case 6----");
		assgn69_inheritance_6cases.case6();
	}

}
