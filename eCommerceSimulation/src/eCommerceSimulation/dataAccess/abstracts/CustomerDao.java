package eCommerceSimulation.dataAccess.abstracts;

import java.util.List;

import eCommerceSimulation.entities.concretes.Customer;

public interface CustomerDao {

	void add(Customer customer);

	void remove(Customer customer);

	void update(Customer customer);

	List<Customer> getAll();

	Customer getById(int id);

}