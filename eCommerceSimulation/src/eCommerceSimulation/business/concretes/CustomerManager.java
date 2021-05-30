package eCommerceSimulation.business.concretes;

import eCommerceSimulation.business.abstracts.CustomerService;
import eCommerceSimulation.core.asbtracts.EmailCheckService;
import eCommerceSimulation.core.asbtracts.GoogleService;
import eCommerceSimulation.core.concretes.EmailValidatorManager;
import eCommerceSimulation.core.concretes.GoogleAdapter;
import eCommerceSimulation.dataAccess.abstracts.CustomerDao;
import eCommerceSimulation.dataAccess.concretes.HibernateCustomerDao;
import eCommerceSimulation.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private EmailCheckService emailCheckService;
	private CustomerDao customerDao;
	private GoogleService googleService;

	public CustomerManager(EmailCheckService emailCheckService, CustomerDao customerDao, GoogleService googleService) {
		this.emailCheckService = emailCheckService;
		this.customerDao = customerDao;
		this.googleService = googleService;
	}

	

	@Override
	public void register(Customer customer) {
		if (customer.getFirstName().length() < 2 || customer.getLastName().length() < 2) {
			System.out.println("Ad ve soyad en az 2 karakter olmali");
		} else if (!emailCheckService.isValid(customer)) {
			System.out.println("Lutfen gecerli bir email giriniz.");
		} else if (customer.getPassword().length() < 6) {
			System.out.println("Sifreniz en az 6 karakter olmali.");
		} else {
			customerDao.add(customer);
		}

	}

	@Override
	public void login(Customer customer) {
		System.out.println("Hosgeldiniz " + customer.getFirstName() + " " + customer.getLastName());
	}

	@Override
	public void registerWithGoogle(Customer customer) {
		googleService.registerWithGoogle(customer.getFirstName() + " " + customer.getLastName());
	}

}