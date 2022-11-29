package ie.atu.week10;

public class PersonApp {
    public static void main(String[] args)
    {
        Person chloe = new Person("Chloe", "Galway", "0871234567");
        System.out.println(chloe.toString());
        Customer brian = new Customer("Peter", "Mervue", "0877654321", "9999", true);
        System.out.println(brian.toString());
    }
}
