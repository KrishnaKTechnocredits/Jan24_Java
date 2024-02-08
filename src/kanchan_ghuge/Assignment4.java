package kanchan_ghuge;

class Assignment4{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode; 
	
	void setPrimaryInfo(String firstName , String lastName){
	     this.firstName = firstName;
         this.lastName = lastName;		
	}
	
	void setOtherInfo(String cmpName, String city, int pincode){
	     this.cmpName = cmpName;
	     this.city = city;
	     this.pincode = pincode;	
    }
	
	void printAllDetails(){
	     System.out.println("First Name is = " + firstName);
	     System.out.println("Last Name is = " + lastName);
	     System.out.println("Company Name is = " + cmpName);
	     System.out.println("City is = " + city);
	     System.out.println("Pincode is = " + pincode);
	}
	
	public static void main(String [] args){
	      Assignment4 assignment4 = new Assignment4();
          assignment4.setPrimaryInfo("Techno","Credit");
          assignment4.setOtherInfo("ptc","pune",411045);
	      assignment4.printAllDetails();
	}
}
	
	
	