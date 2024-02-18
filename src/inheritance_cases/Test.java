package inheritance_cases;

public class Test {

	public static void main(String[] args) {
		System.out.println("-----Case1-----");
		Manager manager = new Manager();
		System.out.println(manager.x);
		System.out.println(manager.y);
		// System.out.println(manager.z);[Manager can not access the z variable as it is
		// not define in the manager class, its take garantee from manager class]

		manager.m1();
		manager.m2();
		// manager.m3();[Manager can not access the m3 method as it is not define in the
		// manager class, its take garantee from manager class ]

		System.out.println("-----Case2-----");
		Employee employee = new Employee();
		System.out.println(employee.x);
		System.out.println(employee.y);
		System.out.println(employee.z);

		employee.m1();
		employee.m2();
		employee.m3();

		System.out.println("-----Case3-----");
		Manager manager1 = new Employee();
		System.out.println(manager1.x);
		System.out.println(manager1.y);
		// System.out.println(manager1.z);[Manager can not access the z variable as it
		// is not define in the manager class, its take garantee from manager class and
		// created the reference of manager class ]

		manager1.m1();
		manager1.m2();
		// manager1.m3();[Manager can not access the m3 method as it is not define in
		// the manager class, its take garantee from manager class and created the
		// reference of manager class ]

		System.out.println("-----Case4-----");
		// Employee employee1 = new manager();[this scenarios is not possible as we can
		// not create the object of parent class and assign it to child class]
		// System.out.println(manager1.x);
		// System.out.println(manager1.y);
		// System.out.println(manager1.z);

		// manager1.m1();
		// manager1.m2();
		// manager1.m3();

		System.out.println("-----Case5-----");
		// this scenarios is same as case 3
		Manager manager2 = new Employee();
		Employee employee2 = new Employee();
		manager2 = employee2;

		System.out.println(manager2.x);
		System.out.println(manager2.y);
		// System.out.println(manager1.z);[Manager can not access the z variable as it
		// is not define in the manager class, its take garantee from manager class and
		// created the reference of manager class ]

		manager2.m1();
		manager2.m2();
		// manager1.m3();[Manager can not access the m3 method as it is not define in
		// the manager class, its take garantee from manager class and created the
		// reference of manager class ]

		System.out.println("-----Case5-----");
		// this scenarios is same as case 2
		Manager manager3 = new Employee();
		Employee employee4 = new Employee();
		employee4 = (Employee) manager3;

		System.out.println(employee4.x);
		System.out.println(employee4.y);
		System.out.println(employee4.z);

		employee4.m1();
		employee4.m2();
		employee4.m3();
	}
}
