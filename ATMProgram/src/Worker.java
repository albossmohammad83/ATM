public class Worker {
    // method to withdraw money from a desired Customer
    public void withdraw(double amount, Customer userAccount){
        userAccount.setBalance(userAccount.getBalance() - amount);
    }
    // method to deposit for a desired Customer
    public void deposit(double amount, Customer userAccount){
        userAccount.setBalance(userAccount.getBalance() + amount);
    }
    // method to display Customer's information
    public void DisplayAccount(Customer userAccount){
        System.out.println("First Name: " + userAccount.firstName + " Last name: " +
                userAccount.lastName + " Balance: " + userAccount.getBalance());
    }

}
