package garima_s;

class ClientInheritance {

	void case1() {
		System.out.println("Case1-> ");
		ManagerInheritance mng = new ManagerInheritance();
		System.out.println(mng.x);
		System.out.println(mng.y);
		//System.out.println(mng.z); (mng can not access the z variable as it is undefined variable in the ManagerInheritance class)
		mng.m1();
		mng.m2();
		//mng.m3();	(mng can not access the m3() method as it is undefined method in the ManagerInheritance class)
	}

	void case2() {
		System.out.println("Case2-> ");
		EmployeeInheritance emp1 = new EmployeeInheritance();
		System.out.println(emp1.x);
		System.out.println(emp1.y);
		System.out.println(emp1.z);
		emp1.m1();
		emp1.m2();
		emp1.m3();
	}

	void case3() {
		System.out.println("Case3-> ");
		ManagerInheritance mng1 = new EmployeeInheritance();
		System.out.println(mng1.x);
		System.out.println(mng1.y);
		//System.out.println(mng1.z); (mng1 can not access the z variable as it is undefined variable in the ManagerInheritance class and mng is a reference type variable.)
		mng1.m1();
		mng1.m2();
		//mng1.m3(); (mng1 can not access the m3() method as it is undefined method in the ManagerInheritance class)
	}

	void case4() {
		System.out.print("Case4-> ");
		System.out.println("Parent class to child class Assignment not Possible");
		//EmployeeInheritance emp2 = new ManagerInheritance();(parent Class(ManagerInheritance) to child Class(EmployeeInheritance) is not possible)
		//System.out.println(emp2.x);
		//System.out.println(emp2.y);
		//System.out.println(emp2.z);
		//emp2.m1();
		//emp2.m2();
		//emp2.m3();
	}

	void case5() {
		System.out.print("Case5-> ");
		System.out.println("Parent class to child class Assignment not Possible");
		EmployeeInheritance emp1 = new EmployeeInheritance();
		ManagerInheritance mng = new ManagerInheritance();
		//emp1=mng; (This behaves same as case 4)
		//System.out.println(emp1.x);
		//System.out.println(emp1.y);
		//System.out.println(emp1.z);
		//emp1.m1();
		//emp1.m2();
		//emp1.m3();
	}

	void case6() {
		System.out.println("Case6-> ");
		EmployeeInheritance emp1 = new EmployeeInheritance();
		ManagerInheritance mng = new ManagerInheritance();
		mng=emp1;//This behaves as same case 3
		System.out.println(mng.x);
		System.out.println(mng.y);
		//System.out.println(mng.z);(mng1 can not access the z variable as it is undefined variable in the ManagerInheritance class and mng is a reference type variable.)
		mng.m1();
		mng.m2();
		//mng.m3();(mng1 can not access the m3() method as it is undefined method in the ManagerInheritance class)
	}

	public static void main(String[] args) {
		ClientInheritance client = new ClientInheritance();
		client.case1();
		client.case2();
		client.case3();
		client.case4();
		client.case5();
		client.case6();
	}
}
