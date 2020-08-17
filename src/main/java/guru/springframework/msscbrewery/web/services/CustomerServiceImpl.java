package guru.springframework.msscbrewery.web.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
    	CustomerDto customerDto = new CustomerDto();
    	customerDto.setId(customerId);
    	customerDto.setName("Joe Black");
        return customerDto;
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
    	CustomerDto customerDto1 = new CustomerDto();
    	customerDto1.setId(UUID.randomUUID());
    	customerDto1.setName("Test");
        return customerDto;
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //add impl to update the beer
    }

    @Override
    public void deleteById(UUID customerId) {
        System.out.println("deleted customer ... ");
    }
}
