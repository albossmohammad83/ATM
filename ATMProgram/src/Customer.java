public class Customer {
    // list of variables for class Customer
    public String firstName;
    public String lastName;
    private int age;
    private String id;
    private double balance;
    private String pin;
    // a constructor to initialize the class Customer variables when constructing a new object of Customer
    public Customer(String firstName, String lastName, int age, String id, double balance, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        this.balance = balance;
        this.pin = pin;
    }
    // a list for setters to set and change the class variables
    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    // a list for getters to get and return the class variables
    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getPin() {
        return pin;
    }
}
