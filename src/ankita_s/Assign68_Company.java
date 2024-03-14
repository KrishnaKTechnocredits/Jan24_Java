package ankita_s;

public class Assign68_Company {
	void case1() {
		Assign68_Manager manager = new Assign68_Manager();
		System.out.println(manager.x);
		System.out.println(manager.y);
		// System.out.println(manager.z);
		manager.m1();
		manager.m2();
		// manager.m3();
		System.out.println("-------------------");
	}

	void case2() {
		Assign68_Employees employees = new Assign68_Employees();
		System.out.println(employees.x);// (Variable x is present in parent so child can access it)
		System.out.println(employees.y);
		System.out.println(employees.z);
		employees.m1(); // (Method m1 is present in parent so child can access it)
		employees.m2();
		employees.m3();
		System.out.println("-------------------");
	}

	void case3() {
		Assign68_Manager manager = new Assign68_Employees();
		System.out.println(manager.x);
		System.out.println(manager.y);
		// System.out.println(manager.z);
		manager.m1();
		manager.m2();
		// manager.m3();
		System.out.println("-------------------");
	}

	void case4() {
		// Employees employees = new Manager(); (Invalid)
		// child as reference variable.
	}

	void case5() {
		Assign68_Manager manager = new Assign68_Manager();
		Assign68_Employees employees = new Assign68_Employees();
		manager = employees;
		System.out.println(manager.x);
		System.out.println(manager.y);
		// System.out.println(manager.z);
		manager.m1();
		manager.m2();
		// manager.m3();
		System.out.println("-------------------");
	}

	void case6() {
		Assign68_Manager manager = new Assign68_Manager();
		Assign68_Employees employees = new Assign68_Employees();
		manager = employees;
		System.out.println(manager.x);
		System.out.println(manager.y);
		// System.out.println(manager.z);
		manager.m1();
		manager.m2();
		// manager.m3();
		System.out.println("-------------------");
	}

	public static void main(String[] args) {
		Assign68_Company cmp = new Assign68_Company();
		cmp.case1();
		cmp.case2();
		cmp.case3();
		cmp.case4();
		cmp.case5();
		cmp.case6();
	}
}
