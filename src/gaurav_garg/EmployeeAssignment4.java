package gaurav_garg;
class EmployeeAssignment4
{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String firstName ,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	void setOtherInfo(String cmpName,String city,int pincode)
	{
		this.cmpName=cmpName;
		this.city=city;
		this.pincode=pincode;	
	}
	
	void printAllDetail()
	{
		System.out.println("Employees name = "+ firstName +lastName );
		System.out.println("Employees company name = "+ cmpName );
		System.out.println("Employees address  = "+ city +","+ pincode);
	}

	public static void main(String...s)
	{
		EmployeeAssignment4 employeeassignment4 = new EmployeeAssignment4();
		employeeassignment4.setPrimaryInfo("techno","credit");
		employeeassignment4.setOtherInfo("ptc","pune",411045);
		employeeassignment4.printAllDetail();
	}
}