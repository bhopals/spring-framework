package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.Customer;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by jt, Spring Framework Guru.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private Map<UUID, Customer> customerMap;

    public CustomerServiceImpl() {
    	
        Customer customer1 = new Customer();
		customer1.setId(UUID.randomUUID());
		customer1.setName("Customer 1");
		customer1.setVersion(1);
		customer1.setCreatedDate(LocalDateTime.now());
		customer1.setUpdateDate(LocalDateTime.now());
                

        Customer customer2 =  new Customer();
        customer2.setId(UUID.randomUUID());
        customer2.setName("Customer 2");
        customer2.setVersion(1);
		customer2.setCreatedDate(LocalDateTime.now());
		customer2.setUpdateDate(LocalDateTime.now());
		

        Customer customer3 = new Customer();
        customer3.setId(UUID.randomUUID());
        customer3.setName("Customer 3");
        customer3.setVersion(1);
        customer3.setCreatedDate(LocalDateTime.now());
        customer3.setUpdateDate(LocalDateTime.now());

        customerMap = new HashMap<>();
        customerMap.put(customer1.getId(), customer1);
        customerMap.put(customer2.getId(), customer2);
        customerMap.put(customer3.getId(), customer3);
    }

    @Override
    public void patchCustomerById(UUID customerId, Customer customer) {
        Customer existing = customerMap.get(customerId);

        if (StringUtils.hasText(customer.getName())) {
            existing.setName(customer.getName());
        }
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        customerMap.remove(customerId);
    }

    @Override
    public void updateCustomerById(UUID customerId, Customer customer) {
        Customer existing = customerMap.get(customerId);
        existing.setName(customer.getName());
    }

    @Override
    public Customer saveNewCustomer(Customer customer) {

        Customer savedCustomer = new Customer();
        savedCustomer.setId(UUID.randomUUID());
        savedCustomer.setName(customer.getName());
        savedCustomer.setVersion(1);
        savedCustomer.setCreatedDate(LocalDateTime.now());
        savedCustomer.setUpdateDate(LocalDateTime.now());
      
        customerMap.put(savedCustomer.getId(), savedCustomer);

        return savedCustomer;
    }

    @Override
    public Customer getCustomerById(UUID uuid) {
        return customerMap.get(uuid);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customerMap.values());
    }
}











