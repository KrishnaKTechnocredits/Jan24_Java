package technocredits.login;

import technocredits.homepage.CheckoutPage;
import technocredits.homepage.HomePage;

public class Login {

	public void login() {
		boolean isValid = isValidUser();
		if(isValid) {
			HomePage homePage = new HomePage();
			CheckoutPage checkPage = new CheckoutPage();
		}
	}
	
	public boolean isValidUser() {
		return true;
	}
	
}
