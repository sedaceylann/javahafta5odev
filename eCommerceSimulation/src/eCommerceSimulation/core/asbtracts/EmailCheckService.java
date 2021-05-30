package eCommerceSimulation.core.asbtracts;

import eCommerceSimulation.entities.concretes.Customer;

public interface EmailCheckService {
	boolean isValid(Customer customer);
}