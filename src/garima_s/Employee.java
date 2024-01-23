package garima_s;

class Employee
{
	String first_Name;
	String last_Name;
	String companyName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String firstName, String lastName)
	{
		first_Name = firstName;
		last_Name = lastName;
	}
	
	void setOtherInfo(String cmpName, String city, int pincode)
	{
		companyName = cmpName;
		this.city = city;
		this.pincode = pincode;
	}
	
	void printAllDetails()
	{
		System.out.println("First Name = " + first_Name);
		System.out.println("Last Name = " + last_Name);
		System.out.println("Company Name = " + companyName);
		System.out.println("City = " + city);
		System.out.println("Pincode = " + pincode);
		
	}
	
	public static void main(String[] args)
	{
		Employee employee = new Employee();
		employee.setPrimaryInfo("techno","credits");
		employee.setOtherInfo("ptc","pune",411045);
		employee.printAllDetails();
	}
}