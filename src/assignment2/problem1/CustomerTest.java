package assignment2.problem1;

public class CustomerTest {
    /*
        - create three instances of Customer
        - Add these instances to an array
        - Then loop through the array and
        - print to the console all those Customers whose billingAddress is located in the city of Chicago
     */

    public static void main(String[] args) {
        //customer one
        Customer c1 = new Customer("Customer", "A", "11111");
        c1.setBillingAddress(new Address("1000N, 4th St", "Chicago", "Illinois", "52557"));
        c1.setShippingAddress(new Address("1000N, 1st St", "Fairfield", "Iowa", "52557"));

        //customer two
        Customer c2 = new Customer("Customer", "B", "22222");
        c2.setBillingAddress(new Address("street B", "city B", "state B", "112333"));
        c2.setShippingAddress(new Address("street BB", "city B", "state B", "112111"));

        //customer three
        Customer c3 = new Customer("Customer", "C", "33333");
        c3.setBillingAddress(new Address("street C", "city C", "state C", "207111"));
        c3.setShippingAddress(new Address("street CC", "city C", "state C", "207111"));

        Customer[] customers = {c1, c2, c3};
        for (Customer customer : customers) {
            if (customer.getBillingAddress().getCity() == "Chicago")
                System.out.println(customer.toString());
        }
    }
}
