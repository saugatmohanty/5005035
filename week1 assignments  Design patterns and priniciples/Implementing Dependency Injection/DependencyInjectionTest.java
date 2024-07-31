public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create repository instance
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a customer
        Customer customer = customerService.getCustomerById("1");
        System.out.println(customer);
        
        customer = customerService.getCustomerById("2");
        System.out.println(customer);
    }
}
