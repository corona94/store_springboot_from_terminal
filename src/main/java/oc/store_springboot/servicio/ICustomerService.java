package oc.store_springboot.servicio;

import oc.store_springboot.modelo.Customer;

import java.util.List;

public interface ICustomerService {

    public List<Customer> Listcustomer();

    public Customer SearchCustomerById(Integer idCustomer);

    public void saveCustomer(Customer customer);

    public void deleteCustomer(Customer customer);

}
