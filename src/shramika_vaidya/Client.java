package shramika_vaidya;

public class Client {

	public static void main(String[] args) {
		Connection connection1 = Connection.getObject();
		Connection connection2 = Connection.getObject();
		System.out.println(connection1);
		System.out.println(connection2);
	}
}
