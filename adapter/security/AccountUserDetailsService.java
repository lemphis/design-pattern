package adapter.security;

import adapter.AccountService;
import adapter.AccountUserDetails;

public class AccountUserDetailsService implements UserDetailsService {

	private final AccountService accountService;

	public AccountUserDetailsService(AccountService accountService) {
		this.accountService = accountService;
	}

	@Override
	public UserDetails loadUser(String username) {
		return new AccountUserDetails(accountService.findAccountByUsername(username));
	}

}
