package ie.atu.week10;

public class PersonApp {
    public static void main(String[] args)
    {
        Person chloe = new Person("Chloe", "Galway", "0871234567");
        System.out.println(chloe.toString());
        Customer brian = new Customer("Peter", "Mervue", "0877654321", "9999", true);
        System.out.println(brian.toString());

        Customer patrick = new Customer();
        patrick.setName("Patrick");
        patrick.setAddress("Far away");
        patrick.setNumber("0831243567");
        patrick.setCustomerNumber("2134");

        System.out.println("Name: " + patrick.getName() + "Address: " + patrick.getAddress() + "Number: " + patrick.getNumber() + "Customer Number: " + patrick.getCustomerNumber());
    }


}
