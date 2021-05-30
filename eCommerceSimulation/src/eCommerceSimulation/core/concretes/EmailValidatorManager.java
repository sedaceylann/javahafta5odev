package eCommerceSimulation.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceSimulation.core.asbtracts.EmailCheckService;
import eCommerceSimulation.entities.concretes.Customer;

public class EmailValidatorManager implements EmailCheckService {
	private static final String EMAIL_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
			+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

	private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

	@Override
	public boolean isValid(Customer customer) {

		Matcher matcher = pattern.matcher(customer.getEmail());
		return matcher.matches();
	}

}