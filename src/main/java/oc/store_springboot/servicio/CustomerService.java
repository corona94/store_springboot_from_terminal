package oc.store_springboot.servicio;

import oc.store_springboot.modelo.Customer;
import oc.store_springboot.repository.ICustomerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Metodos transaccionales
public class CustomerService implements ICustomerService{

    @Autowired
    private ICustomerRespository customerRespository;



    @Override
    public List<Customer> Listcustomer() {

        List<Customer> customers = customerRespository.findAll();
        return customers;
    }

    @Override
    public Customer SearchCustomerById(Integer idCustomer) {

        //finbyid regresa un optional entonces con orElse en caso de no encontrarlo se gresa un valor nulo.
        Customer customer = customerRespository.findById(idCustomer).orElse(null);

        return customer;
    }

    @Override
    public void saveCustomer(Customer customer) {

        customerRespository.save(customer);

    }

    @Override
    public void deleteCustomer(Customer customer) {

        customerRespository.delete(customer);

    }
}
