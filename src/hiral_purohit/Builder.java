package hiral_purohit;

//eager loading implementation
public class Builder {

	// public instance initialization
	private static final Builder builder = new Builder();

	private Builder() {
		// private constructor
		System.out.println("eager loading implementation");
	}

	public static Builder getObject(){
		return builder;
	}
}
