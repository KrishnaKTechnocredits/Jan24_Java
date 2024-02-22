package hiral_purohit;

public class Company_Inheritance {

	void case1() {
		Manager mng = new Manager();
		System.out.println(mng.x);
		System.out.println(mng.y);
		// System.out.println(mng.z);//CE:variable z is class Employees(sub/child
		// class)'s member.so can't call it)
		mng.m1();
		mng.m2();
		// mng.m3();(//CE:m3 method is of class Employees which is sub/child class so
		// can't call it)
		System.out.println(".......................");
	}

	void case2() {
		Employees emp = new Employees();
		System.out.println(emp.x); // variable x is class Manager(super/parent class)'s member.its available to
									// Employee (child) class.
		System.out.println(emp.y);
		System.out.println(emp.z);
		emp.m1();// m1 method is class Manager(super/parent class)'s member.its available to
					// Employee (child) class.
		emp.m2();
		emp.m3();
		System.out.println(".......................");
	}

	void case3() {
		Manager mng = new Employees();
		System.out.println(mng.x);
		System.out.println(mng.y);// (variable are properties if class which doesn't change from compile time to
									// runtime.so it will take y of Manger class)
		// System.out.println(mng.z);(in this reference variable of object is
		// Manager(super class).so,compile time it will through error)
		mng.m1();
		mng.m2();// (in this it will execute m2 of Employee class because runtime method
					// (behavior) will change.)
		// mng.m3();(m3 id present in super class so sub class can't call it)
		System.out.println(".......................");
	}

	void case4() {
		// Employees emp = new Manager();(CE because reference variable of object is
		// ofEmployee(child) class.
	}

	void case5() {
		Manager mng = new Manager();
		Employees emp = new Employees();
		mng = emp;
		System.out.println(mng.x);
		System.out.println(mng.y);// (variable are properties if class which doesn't change from compile time to
									// runtime.so it will take y of Manger class)
		// System.out.println(mng.z);(in this reference variable of object is
		// Manager(super class).so,compile time it will through error)
		mng.m1();
		mng.m2();// (in this it will execute m2 of Employee class because runtime method
					// (behavior) will change.)
		// mng.m3();(m3 id present in super class so sub class can't call it)
		System.out.println(".......................");
	}

	void case6() {
		Manager mng = new Employees();
		Employees emp = new Employees();
		mng = emp;
		System.out.println(mng.x);
		System.out.println(mng.y);// (variable are properties if class which doesn't change from compile time to
									// runtime.so it will take y of Manger class)
		// System.out.println(mng.z);(in this reference variable of object is
		// Manager(super class).so,compile time it will through error)
		mng.m1();
		mng.m2();// (in this it will execute m2 of Employee class because runtime method
					// (behavior) will change.)
		// mng.m3();(m3 id present in super class so sub class can't call it)
		System.out.println(".......................");
	}

	public static void main(String[] args) {
		Company_Inheritance company = new Company_Inheritance();
		company.case1();
		company.case2();
		company.case3();
		company.case4();
		company.case5();
		company.case6();
	}

}
