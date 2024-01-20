package shafaque;

class Employee{

    String firstName,lastName,cmpName,city;
    int pincode;
  
    void setprimaryinfo(String firstName, String lastName)
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
	System.out.println("FirstName is " + this.firstName + ", LastName is " + this.lastName + ", City is " + this.city + ",Pincode is " + this.pincode );
	}
	
    public static void main(String args[])
	{
    Employee Employee = new Employee();
    Employee.setprimaryinfo("techno","credits");
    Employee.setOtherInfo("ptc","pune",411045) ;
    Employee.printAllDetails();
	}
}
  
  
    
     