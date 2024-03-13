package phenol_verma;

public class Builder {

	public static void main(String[] args) {
		BuilderClient conn1 = BuilderClient.getObject();
		BuilderClient conn2 = BuilderClient.getObject();
		BuilderClient conn3 = BuilderClient.getObject();
		System.out.println(conn1);
		System.out.println(conn2);
		System.out.println(conn3);
	}
}
