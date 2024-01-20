package akshada_marne;

class Employee{
	String fname, lname, cmpname, city;int pincode;
	
	void setPrimaryInfo(String fname, String lname){
		this.fname=fname;
		this.lname=lname;
	}
	
	void setOtherInfo(String cmpname, String city, int pincode){
		this.cmpname=cmpname;
		this.city=city;
		this.pincode=pincode;
	}
	
	void printAllDetails(){
		System.out.println("Employee name is "+fname+" "+lname);
		System.out.println("Employee address is "+city+" "+pincode);
		System.out.println("Employee works in an organization "+cmpname);
	}

	public static void main(String args[]){
		Employee employee = new Employee();
		employee.setPrimaryInfo("techno","credits");
		employee.setOtherInfo("ptc","pune",411045);
		employee.printAllDetails();
	}
}
