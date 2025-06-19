package oc.store_springboot;

import oc.store_springboot.modelo.Customer;
import oc.store_springboot.repository.ICustomerRespository;
import oc.store_springboot.servicio.ICustomerService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication

//Aqui se implementa el metodo run de CommandLineRunner
public class StoreSpringbootApplication implements CommandLineRunner {

	@Autowired
	private ICustomerService customerService;
	//Esto es para escribir en consola
	//Como estamos usando un framework ya no se utiliza println ahora es Longger

	private static final Logger logger =
			LoggerFactory.getLogger(StoreSpringbootApplication.class);

	//Obtener el salto de linea de manera generica
	String nl = System.lineSeparator();

	public static void main(String[] args) {
		SpringApplication.run(StoreSpringbootApplication.class, args);
	}

	//Metodo run para la aplicacion
	@Override
	public void run(String... args) throws Exception { //Esto ya no es un metodo estatico


		storeApp();

	}

	private void storeApp(){

		boolean exit = false;
		var consol = new Scanner(System.in);

		while (!exit){

			logger.info("***Aplicacion custoner****");
			logger.info("" +
					"\n*** Store App ***\n" +
					"1-Mostrar clientes\n" +
					"2-Agregar Clientes\n" +
					"3-Modificar Clietnes\n" +
					"4-Eliminar Clientes\n" +
					"5-salir\n" +
					"Opcion: ");
			var option = Integer.parseInt(consol.nextLine());

			switch(option) {
				case 1 -> {
					logger.info("\n--- Listado de clientes ---");
					List<Customer> customers = customerService.Listcustomer();
					customers.forEach(customer ->
					{
						logger.info(nl + "Id: "+customer.getCustomer_id());
						logger.info("Nombre: "+customer.getName_customer());
						logger.info("Apellido: "+customer.getLastname_customer());
						logger.info("Membresia: "+customer.getMembership());

						//logger.info(customer.toString() + nl);
					});
				}

				case 2 -> {

					logger.info("*** Agregar cliente ***");

					Customer customer = new Customer();

					customer.setName_customer("Carlos");
					customer.setLastname_customer("Ramirez");
					customer.setMembership("o2imk");


					customerService.saveCustomer(customer);

				}

				case 3 -> {
				}

				case 4 -> {

				}

				case 5 -> {
					exit = true;

				}

				default -> {
					logger.info("Opción errónea\n");
				}
			}

		}
	}


}
