package technocredits.exceptionExample;

public class Exception9 {
	void startBrowser(String browser){
		if(browser.equals("chrome"))
			System.out.println("open chrome");
		else if(browser.equals("safari"))
			System.out.println("open safari");
		else
			//throw new InvalidBrowserException();
			throw new InvalidBrowserException(browser + " is not supported, only supported browsers are chrome and safari");
	}
	
	public static void main(String[] args) throws Exception {
		Exception9 exception9 = new Exception9();
		exception9.startBrowser("ie");
		System.out.println("end");
	}
}
