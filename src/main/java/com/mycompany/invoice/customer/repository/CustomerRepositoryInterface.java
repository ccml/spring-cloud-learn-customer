package com.mycompany.invoice.customer.repository;

import com.mycompany.invoice.core.entity.customer.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositoryInterface extends CrudRepository<Customer, Long> {

    /*
    List<Invoice> list();
    Invoice getById(String number);
    Invoice create(Invoice invoice);
     */
}
