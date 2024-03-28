package technocredits.collectionsframework.listdemo;

//Getter
//Setter
//Constructor
//toString()
//equals()
//hashCode()
//compare()

public class Employee {

	private int id;
	private String firstName, lastName, userName;

	Employee(){
		
	}
	
	public Employee(int id, String firstName, String lastName, String userName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String toString() {
		return id + "->" + firstName + "->" + lastName + "->" + userName;
	}

}
