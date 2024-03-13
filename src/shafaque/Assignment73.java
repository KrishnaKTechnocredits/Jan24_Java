package shafaque;

public class Assignment73 {

	public static void main(String[] args) {
		LazyLoadingConnection con1 = LazyLoadingConnection.getobject();
		LazyLoadingConnection con2 = LazyLoadingConnection.getobject();
		LazyLoadingConnection con3 = LazyLoadingConnection.getobject();
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
	}
}
