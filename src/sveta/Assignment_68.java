package sveta;

public class Assignment_68 {

	void applyCase1() {
		Manager1 manager1=new Manager1();
		System.out.println("#CASE - 1");
		System.out.println(manager1.id);
		System.out.println(manager1.name);
		manager1.getData();
		manager1.display();
	}
	void applyCase2() {
		System.out.println("\n-----------------------------");
		System.out.println("#CASE - 2");
		Employee1 Employee1=new Employee1();
		System.out.println(Employee1.id);
		System.out.println(Employee1.empname);
		Employee1.getData();
	}
	void applyCase3() {
		Manager1 manager1=new Employee1();
		System.out.println("\n-----------------------------");
		System.out.println("#CASE - 3");
		System.out.println(manager1.id);
		System.out.println(manager1.name);
		manager1.getData();
		manager1.display();
	}
	void applyCase4() {
		System.out.println("\n-----------------------------");
		System.out.println("#CASE - 4");
		System.out.println("Invalid case because this is not possible in java");
		/*Employee1 employee = new Manager1();
		 System.out.println(employee.id);
		 System.out.println(employee.name);
		 employee.display();
		 employee.getData();
		 */
	}
	void applyCase5() {
		System.out.println("\n-----------------------------");
		System.out.println("#CASE - 5");
		Manager1 manager1=new Employee1();
		Employee1 employee1= new Employee1();
		manager1=employee1;
		//use child class variable if available
		System.out.println(manager1.id);
		System.out.println(manager1.name);
		manager1.display();
		manager1.getData();
	}
	
	void applyCase6() {
		System.out.println("-----------------------------");
		System.out.println("#CASE - 6");
		Manager1 manager1=new Employee1();
		Manager1 manager2=new Manager1();
		manager1=manager2;
		//use child class variable if available
		System.out.println(manager1.id);
		System.out.println(manager1.name);
		manager1.display();
	}
	
	public static void main(String[] args) {
		Assignment_68 assignment_68=new Assignment_68();
		assignment_68.applyCase1();
		assignment_68.applyCase2();
		assignment_68.applyCase3();
		assignment_68.applyCase4();
		assignment_68.applyCase5();
		assignment_68.applyCase6();
		
	}

}
