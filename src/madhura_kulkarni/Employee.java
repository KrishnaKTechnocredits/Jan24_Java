package madhura_kulkarni;

//I want to create a class called Employee. instance variable : firstName, lastName, cmpName, city, pincode

//setPrimaryInfo(String firstName, String lastName)
//setOtherInfo(String cmpName, String city, int pincode)
//printAllDetails() -> print all 5 instance variable.

//main -> setPrimaryInfo("techno","credits") -> setOtherInfo("ptc","pune",411045) -> printAllDetails()

class Employee
{
	String firstName, lastName, cmpName, city;
	int pincode;
	
	void setPrimaryInfo(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void setOtherInfo(String cmpName, String city, int pincode)
	{
		this.cmpName = cmpName;
		this.city = city;
		this.pincode = pincode;
	}
	
	void printAllDetails()
	{
		System.out.println("First Name= "+firstName+"\nLast Name= "+lastName
		+"\nCompany Name= "+cmpName+"\nCity= "+city+"\nPincode= "+pincode);
	}
	
	public static void main(String[] args)
	{
		Employee employee= new Employee();
		employee.setPrimaryInfo("techno","credits");
		employee.setOtherInfo("ptc","pune",411045);
		employee.printAllDetails();
	}
	
}
