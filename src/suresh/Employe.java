package suresh;

class Employe
{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	String pincode;
	
	void setPrimatyInfo(String firstName ,String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void otherInfo(String cmpName,String city, String pincode)
	{
		this.cmpName = cmpName;
		this.city = city;
		this.pincode = pincode;
	}
	void printAllDetails()
	{
		System.out.println("firstName is "+ firstName);
		System.out.println("lastName is "+ lastName);
		System.out.println("cmpName is "+ cmpName);
		System.out.println("city is "+ city);
		System.out.println("pincode is "+ pincode);
	
	}
	public static void main (String[] Args)
	{
		Employe employe1 = new Employe();
		employe1.setPrimatyInfo("Sureshbabu","MC");
		employe1.otherInfo("cloudramp","bangalore","560036");
		employe1.printAllDetails();
		
		Employe employe2 = new Employe();
		employe1.setPrimatyInfo("babu","MC");
		employe1.otherInfo("cloud","bangalore","560078");
		employe1.printAllDetails();
	}
}