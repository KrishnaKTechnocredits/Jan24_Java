package dharma;

public class Assignment68 {

	void case1() {
		Manager mng = new Manager();
		System.out.println(mng.id);
		System.out.println(mng.name);
	//	System.out.println(mng.address);  address variable is not exist in manager class as we have created object with manager reference.

		mng.getInfo();
		mng.display();
	//	mng.getEmp(); getEmp method belongs to Employee class and we have created object with Manager reference.
	}

	void case2() {
		Employee1 emp = new Employee1();
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.address);

		emp.getInfo();
		//System.out.println("Employee will print its own display method.");
		emp.display();
		emp.getEmp();
	}

	void case3() {
		Manager mng = new Employee1();
		System.out.println(mng.id);
		System.out.println(mng.name);
	// System.out.println(mng.address); mng object is created using reference of Manager 
										//  as address is not present in manager class we can't use it.

		mng.getInfo();
		//System.out.println("at compile time object will refer to manager but at run time it will print Employee's display method");
		mng.display();
	//	mng.getEmp(); as we created object using manager ref we can't use employee method.
	}

	/* As we can't create parent object using child reference. this case is not applicable.
	 * void case4() {
		Employee1 emp = new Manager();
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.address);
		
		emp.getInfo();
		emp.display();
		emp.getEmp();
	}*/

	void case5() {
		Manager mng = new Employee1();
		Employee1 emp = new Employee1();
		mng = emp;
		System.out.println(mng.id);
		System.out.println(mng.name);
	//	System.out.println(mng.address); same as case 3. object reference is of Manager so can't call employee property.

		mng.getInfo();
		mng.display();
	//	mng.getEmp(); we have created object with manager reference it will behave as case 3.
	}
/* Parent can't be assigned to child so this case will not work (CE)
	void case6() {
		Manager mng = new Employee1();
		Employee1 emp = new Employee1();
		emp = mng;
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.address);
		
		emp.getInfo();
		emp.display();
		emp.getEmp();
	} */

	 public static void main(String[] args){
		Assignment68 test = new Assignment68();
		test.case1();
		System.out.println("=================");
		test.case2();
		System.out.println("=================");
		test.case3();
		System.out.println("=================");
		//test.case4(); this is not applicable
		test.case5();
		System.out.println("=================");
		//test.case6(); Parent can't be assigned to child. this is not applicable.
	}
}

class Employee1 extends Manager {
	int id = 100;
	String address = "jamnager";

	void getEmp() {
		System.out.println("Employee id :" + id);
	}

	void display() {
		System.out.println("Employee address :" + address);
	}
}

class Manager {
	int id = 11;
	String name = "Dharma";
	int x = 10;

	void getInfo() {
		System.out.println("Manager id :" + id);
	}

	void display() {
		System.out.println("Manager name :" + name);
	}
}

