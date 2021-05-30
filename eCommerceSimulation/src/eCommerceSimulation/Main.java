package eCommerceSimulation;

import eCommerceSimulation.business.concretes.CustomerManager;
import eCommerceSimulation.core.concretes.EmailValidatorManager;
import eCommerceSimulation.core.concretes.GoogleAdapter;
import eCommerceSimulation.dataAccess.concretes.HibernateCustomerDao;
import eCommerceSimulation.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Seda");
		customer.setLastName("Ceylan");
		customer.setEmail("ceylanseda06@gmail.com");
		customer.setPassword("598598");

		CustomerManager customerManager = new CustomerManager(new EmailValidatorManager(), new HibernateCustomerDao(),
				new GoogleAdapter());

		customerManager.register(customer);
		customerManager.registerWithGoogle(customer);
		customerManager.login(customer);

	}

}