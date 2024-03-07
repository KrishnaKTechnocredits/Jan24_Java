package phenol_verma;

public class Client {

	public static void main(String[] args) {
		Connection conn1 = Connection.getObject();
		Connection conn2 = Connection.getObject();
		Connection conn3 = Connection.getObject();
		System.out.println(conn1);
		System.out.println(conn2);
		System.out.println(conn3);
	}
}
