package samiksha;

//  by using Lazy loading singletone design pattern.

public class Connection {
	
	private static Connection con = null;
	//static reff variable- con should be private. so that client never change 
	//con's value.
	private Connection() {
	// constructor should always private. so that Client class 
	// never create object of Connection class.
	 }
	 
	 static Connection getObject(){
		 if(con==null) {
			 con= new Connection();
		// make con= null at above. and then if it is null then only can create
		// new object.
	    // once con1 calls, object get created of Connection class. and due to static
	    // its value keep updated for all. next for con2 calls, con having that new Connection object
		// so it will not create object again.
		 }
		 return con;
		 //it returns object of Connection class.
	 }
}

