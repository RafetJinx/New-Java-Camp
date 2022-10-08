public class Main {
    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Silicon Valley");

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();

        Company company = new Company();
        company.setTaxNumber("100000");
        company.setCompanyName("Arçelik");
        company.setId(100);

        CustomerManager customerManager1 = new CustomerManager(new Person(), new TeacherCreditManager());

        Person person = new Person();
        person.setFirstName("Intelli");
        person.setNationalIdentity("11");

        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();


        CustomerManager customerManager2 = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager2.giveCredit();

    }
}
