public class CustomerManager {
    private Customer customer;

    public CustomerManager(Customer customer) {
        this.customer = customer;
    }

    public void save(){
        System.out.println("Müşteri eklendi: " + customer.getId());
    }

    public void delete(){
        System.out.println("Müşteri silindi: " + customer.getId());
    }
}
