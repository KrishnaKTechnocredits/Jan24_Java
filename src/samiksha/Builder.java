package samiksha;

//Egar loading singletone design : 
//object is creacted first in reff variable.
// have to call only getobject method which return that
// object every time.no need to create new obj every time.

public class Builder {

	private static Builder build = new Builder();

	private Builder() {

	}

	static Builder getObject() {
		return build;
	}
}
