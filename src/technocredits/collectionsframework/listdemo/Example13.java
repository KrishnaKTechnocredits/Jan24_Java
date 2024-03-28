package technocredits.collectionsframework.listdemo;

import java.util.ArrayList;
import java.util.List;

public class Example13 {
	
	List<Employee> getListOfEmployee(){
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setFirstName("Maulik");
		emp1.setLastName("Kanani");
		emp1.setUserName("mkanani");
		
		Employee emp2 = new Employee(2, "Krishna", "Kanani", "mkanani");
		Employee emp3 = new Employee(3, "Dhara", "Boda", "dboda");
		
		listOfEmployees.add(emp1);
		listOfEmployees.add(emp2);
		listOfEmployees.add(emp3);
		
		return listOfEmployees;
	}
	
	public static void main(String[] args) {
		Example13 example13 = new Example13();
		List<Employee> listOfEmployee = example13.getListOfEmployee();
		System.out.println("total employees in the table : " + listOfEmployee.size());
		
		
		System.out.println(listOfEmployee);
		for(Employee e : listOfEmployee) {
			System.out.println(e);
		}
		
		List<String> list = new ArrayList<String>();
		list.add("Hi");
		list.add("Hello");
		
		System.out.println(list);
		/*for(String s : list) {
			System.out.println(s);
		}*/
		
	}
}
