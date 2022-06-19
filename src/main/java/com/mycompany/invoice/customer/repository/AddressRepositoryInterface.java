package com.mycompany.invoice.customer.repository;

import com.mycompany.invoice.core.entity.customer.Address;
import com.mycompany.invoice.core.entity.customer.Customer;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepositoryInterface extends CrudRepository<Address, Long> {

    /*
    List<Invoice> list();
    Invoice getById(String number);
    Invoice create(Invoice invoice);
     */
}
