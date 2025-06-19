#Store springboot from terminal

Creacion de proyecto en Java con springboot
Se reliaz desde https://start.spring.io/

Se utiliza Maven como empaquetador de proyecto.
version de java 3.5.0

Packing jar
java 24

las dependencias que se utilizan son:
Sprind Data JPA
mysql
lombok

En el archivo src/main/resources/application.propertiers

En el archivo pomp.xml se agregan las dependencias del pryecto https://mvnrepository.com/

JPA java Persistence API

Se agrega en el proyecto el archivo logback-spring.xml 
basicamente evita mandar demasiada información a la consola.


Spring es una fabrica de objetos.


/**********************************************/

Arquitectura de Sring

Presentación(@springboot application) <---> Servicio(@Service) <---> Datos(@Respository) <---> Entidad(@entity) <----> DB

Hibeernate se encargara JPA con hibarnate para realizar el mapeo con la base de datos  
estaa tecnologia se le conoce como ORM

Se creaa el service que funcionara como DAO (Objeto de Acceso a Datos)

Con spring se puede realiza el manejo transaccional.
Se aplica el concepto de rollback


Se crea la clase de entidad y se simplifica con lombok (getters,stters, etc...)

Se creo la clase de entidad en este caso el paquete modelo y la clase customer

Se crea la clase de respositorio hace de DAO aqui se tendran los metodos para agregar, modificar, eliminar. En este caso es uan interface.

Se crea la interface servicio dentro del paquete servicio.
Ahora se agrega la implementación de la interface servicio.
La anotación @Transactional viene de org.springframework.transaction.annotation.Transactional
Si ocurre una excepción dentro del método, Spring hará rollback automáticamente.

🔧 ¿Dónde se usa esto?
Servicios que modifican la base de datos.

Métodos donde varias operaciones deben ser atómicas.

Control de integridad y consistencia de datos.


@service deciende de @Component (@Controller @Service @Respository)

Una vez implementados los metodos de la interface IcustomerServicio se realiza la inyeccion de dependencia


@Autowired
a anotación @Autowired en Java (usualmente usada con Spring Framework) sirve para inyectar dependencias automáticamente. Es decir, Spring se encarga de crear e insertar los objetos necesarios en tu clase sin que tú tengas que instanciarlos manualmente.

La inyección de dependencias es un principio de diseño que consiste en proveer los objetos que una clase necesita para funcionar (sus dependencias) desde afuera, en lugar de que la propia clase los cree.

Esto hace que tu código sea más:

Modular

Fácil de probar (testear)

Mantenible

Spring busca un bean compatible (un componente que maneja internamente) y lo inyecta automáticamente en la variable o constructor marcado con @Autowired.


Se realiza la intalacion de lombok desde los plugins

´´´java



´´´