package puja_poreddiwar;

public class Assignment68 {

	void case1() {
		Manager mng = new Manager();
		System.out.println(mng.x);
		System.out.println(mng.y);
		// System.out.println(mng.z); CE -variable z is present in Employees(child)
		/*
		 * class and here reference variable created for manager class hence we cannot
		 * call it and get CE
		 */
		mng.m1();
		mng.m2();
		// mng.m3();
		/*
		 * CE - m3 method is present in Employees(child) class and here reference
		 * variable created for manager class hence we cannot call it and get CE
		 */
		System.out.println("-------------------------");
	}

	void case2() {
		Employee emp = new Employee();
		System.out.println(emp.x); /* variable x is present under parent class hence it will print 10 as x value */
		System.out.println(emp.y);
		System.out.println(emp.z);
		emp.m1(); // m1() method is present in parent class hence it will call m1 from parent
					// class

		emp.m2();
		emp.m3();
		System.out.println("-------------------------");
	}

	void case3() {
		Manager mng = new Employee();
		System.out.println(mng.x);
		System.out.println(mng.y);/*
									 * variable are properties if class which doesn't change from compile time to
									 * runtime.hence it will call y from Manager class)
									 */
		// System.out.println(mng.z);
		/*
		 * Reference variable of object is Manager(parent class).hence it will have
		 * compile time error
		 */
		mng.m1();
		mng.m2();// It will execute method m2 of Employee class because runtime method behavior
					// changes
		// mng.m3(); method m3 id present under parent class hence child class can't
		// call
		// it)
		System.out.println("------------------------");
	}

	void case4() {
		// Employees emp = new Manager();
		/*
		 * Compilation error because emp is reference variable of object which is child
		 * class.
		 */
	}

	void case5() {
		Manager mng = new Manager();
		Employee emp = new Employee();
		mng = emp;
		System.out.println(mng.x);
		System.out.println(mng.y);// variable are properties if class which doesn't change from compile time to
									// runtime.hence it will call y from Manager class)
		// System.out.println(mng.z); Reference variable of object is Manager(parent
		// class).hence it will have compile time error
		mng.m1();
		mng.m2();// It will execute method m2 of Employee class because runtime method behavior
					// changes
		// mng.m3(); method m3 id present under parent class hence parent class cannot
		// call it
		System.out.println("-------------------------");
	}

	void case6() {
		Manager mng = new Employee();
		Employee emp = new Employee();
		mng = emp;
		System.out.println(mng.x);
		System.out.println(mng.y);/*
									 * variable are properties if class which does not change from compile time to
									 * runtime.hence it will call y from Manager class)
									 */
		// System.out.println(mng.z); Reference variable of object is Manager(parent
		// class).hence it will have compile time error
		mng.m1();
		mng.m2(); // It will execute m2 of Employee class because runtime method behavior changes
		// mng.m3(); method m3 id present under parent class hence parent class cannot
		// call it
		System.out.println("-------------------------");
	}

	public static void main(String[] args) {
		Assignment68 company = new Assignment68();
		company.case1();
		company.case2();
		company.case3();
		company.case4();
		company.case5();
		company.case6();
	}

}
