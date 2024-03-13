package hiral_purohit;

//lazy loading implementation.
public class Connection {

	// private instance, so that it can be
	// accessed by only by getObject() method
	private static Connection con;

	private Connection() {
		// private constructor
		System.out.println("lazy loading implementation");
	}

	// method to return instance of class
	public static Connection getObject() {
		if (con == null) {
			con = new Connection();
		}
		return con;
	}

}
