package eCommerceSimulation.business.abstracts;

import eCommerceSimulation.entities.concretes.Customer;

public interface CustomerService {
	void register(Customer customer);

	void login(Customer customer);

	void registerWithGoogle(Customer customer);
}