package garima_s;

public class Client {

	public static void main(String[] args) {
		Connection con1 = Connection.getObject();
		Connection con2 = Connection.getObject();
		System.out.println(con1);
		System.out.println(con2);
	}
}
