package oc.store_springboot.repository;

import oc.store_springboot.modelo.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRespository extends JpaRepository<Customer,Integer> {
}
