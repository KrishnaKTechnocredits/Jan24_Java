/*I want to create a class called Employee. instance variable : firstName, lastName, cmpName, city, pincode

setPrimaryInfo(String firstName, String lastName)
setOtherInfo(String cmpName, String city, int pincode)
printAllDetails() -> print all 5 instance variable.

main -> setPrimaryInfo("techno","credits") -> setOtherInfo("ptc","pune",411045) -> printAllDetails()*/
package pallavi_raut;
class Employee
{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
    void setOtherInfo(String cmpName, String cityName, int pincodeNum){
		this.cmpName=cmpName;
		city=cityName;
		pincode=pincodeNum;
	}	

	void printAllDetails(){
		System.out.println("Firstname : " + firstName);
		System.out.println("Lastname : " + lastName);
		System.out.println("Company : " + cmpName);
		System.out.println("City is : " + city);
		System.out.println("Pincode : " + pincode);
	}

    public static void main (String[] args){
		Employee emp=new Employee();
		emp.setPrimaryInfo("techno","credits");
		emp.setOtherInfo("ptc","pune",411045); 
		emp.printAllDetails();
	}		
}	
	