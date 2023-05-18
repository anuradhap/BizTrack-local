package com.bizTrack.BizTrack.Service.Implementation;

import com.bizTrack.BizTrack.Exception.BizTrackExceptionHandler;
import com.bizTrack.BizTrack.Exception.UserNotFoundException;
import com.bizTrack.BizTrack.Model.Customer;
import com.bizTrack.BizTrack.Repository.CustomerRepository;
import com.bizTrack.BizTrack.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer, Long customerId) throws UserNotFoundException {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if(optionalCustomer.isPresent()) {
            Customer updatedCustomer = optionalCustomer.get();
            if(Objects.nonNull(customer.getFirstName()) && !"".equalsIgnoreCase(customer.getFirstName())){
                updatedCustomer.setFirstName(customer.getFirstName());
            }
            if(Objects.nonNull(customer.getLastName()) && !"".equalsIgnoreCase(customer.getLastName())){
                updatedCustomer.setLastName(customer.getLastName());
            }
            if(Objects.nonNull(customer.getAddress()) && !"".equalsIgnoreCase(customer.getAddress())){
                updatedCustomer.setAddress(customer.getAddress());
            }
            if(Objects.nonNull(customer.getEmailId()) && !"".equalsIgnoreCase(customer.getEmailId())){
                updatedCustomer.setEmailId(customer.getEmailId());
            }
            if(Objects.nonNull(customer.getPhoneNumber()) && !"".equalsIgnoreCase(customer.getPhoneNumber())){
                updatedCustomer.setPhoneNumber(customer.getPhoneNumber());
            }
            if(Objects.nonNull(customer.getPassword()) && !"".equalsIgnoreCase(customer.getPassword())){
                updatedCustomer.setPassword(customer.getPassword());
            }
            return customerRepository.save(updatedCustomer);
        } else {
            throw new UserNotFoundException("User not found with ID: " + customerId);
        }
    }
}
