package varsha.lazysingleton;

public class Client {
	
	public static void main(String[] args) {
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		Connection con3 = Connection.getConnection();
		
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
	}

}
