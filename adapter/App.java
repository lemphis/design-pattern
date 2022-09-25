package adapter;

import adapter.security.AccountUserDetailsService;
import adapter.security.LoginHandler;
import adapter.security.UserDetailsService;

public class App {

	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
		LoginHandler loginHandler = new LoginHandler(userDetailsService);
		String login = loginHandler.login("lemphis", "lemphis");
		System.out.println(login);
	}

}
