package varsha.lazysingleton;

//Assignment - 73 : 3rd March'2024
//Write an example for singleton design pattern on Connection class.
//Prove design patter works fine using client class.
//Note : use lazy loading implementation.

public class Connection {
	
	private static Connection connection;
	
	final static Connection getConnection() {
		if(connection == null) {
			connection = new Connection();
		}
		return connection;
	}
}
