/*
 * Chapter 9 Lab
 * Description: simulate an ATM machine that allow the user to sign in and check their balance,
 * deposit, or make a withdraw
 * Name: Mohammad Abdelrahman
 * ID: 920158652
 * Class: CSC 211-02
 * Semester: fall 2020
 */
import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in); // create an object input to store the user's input
    Database data = new Database(); // create a database object and initialize it through default constructor
    Customer currCustomer; // create an object but without initialization yet to keep track of customer
    Worker work = new Worker(); // create a worker objet
    int opt; // variable opt to keep track of the user's input for the main menu
    do{
        System.out.println("Welcome to the ATM what would you like to do:\n" +
                       "1. Sign In\n" +
                       "2. Show Customer list\n" +
                       "3. Exit");
        opt = input.nextInt();

        switch (opt){
            case 1:
                System.out.println("how would you like to Sign In:\n" +
                                   "1. Bank Account ID\n" +
                                   "2. Full Name");
                int sign = input.nextInt();
                if(sign == 1){ // log in  by ID
                    System.out.print("Please Enter your Bank ID: ");
                    String id = input.next();
                    System.out.print("Please Enter your PIN: ");
                    String pin = input.next();
                    Customer currCustomerCheck1 = data.searchAccountID(id); // temp object to check the user's ID
                    Customer currCustomerCheck2 = data.searchAccountPIN(pin); // temp object to check the user's PIN
                    if(currCustomerCheck1 != null && currCustomerCheck2 != null ){ // null objects means non existing members in the database
                        currCustomer = currCustomerCheck1; // customer found! and assigned to currCustomer
                        int menu;
                      do { // greet the customer by their first name and prompt another menu to access their balance
                          System.out.println("Welcome back " + currCustomer.firstName + "! What would you like to do:\n" +
                                  "1. Balance statement\n" +
                                  "2. Make withdrawal\n" +
                                  "3. Make deposit\n" +
                                  "4. Log out");
                           menu = input.nextInt();
                          switch (menu) {
                              case 1: // show the lodged in customer balance
                                  System.out.println("Your Balance: " + currCustomer.getBalance());
                                  break;
                              case 2: // withdraw money from the lodged in user's balance
                                  System.out.print("How much would you like to withdraw: ");
                                  double with = input.nextDouble();
                                  work.withdraw(with, currCustomer);
                                  System.out.println("Your Balance: " + currCustomer.getBalance());
                                  break;
                              case 3: // deposit money in the lodged in user's balance
                                  System.out.print("How much would you like to deposit: ");
                                  double depo = input.nextDouble();
                                  work.deposit(depo, currCustomer);
                                  System.out.println("Your Balance: " + currCustomer.getBalance());
                                  break;
                              case 4:
                                  System.out.println("You've been logged out");
                                  break;
                          }
                      } while(menu !=4);
                    } else { // user not found (null)
                        System.out.println("Invalid information!");
                    }
                } else if (sign == 2) { // log in by full name
                    System.out.print("Please Enter your First Name: ");
                    String firstName = input.next();
                    System.out.print("Please Enter your Last Name: ");
                    String lastName = input.next();
                    System.out.print("Please Enter your PIN: ");
                    String pin = input.next();
                    Customer currCustomerCheck1 = data.searchFullName(firstName, lastName);// temp object to check the user's full name
                    Customer currCustomerCheck2 = data.searchAccountPIN(pin); // temp object to check the user's PIN
                    if (currCustomerCheck1 != null && currCustomerCheck2 != null) { // null objects means non existing members in the database
                        currCustomer = currCustomerCheck1; // customer found! and assigned to currCustomer
                        int menu;
                        do { // greet the customer by their first name and prompt another menu to access their balance
                            System.out.println("Welcome back " + currCustomer.firstName + "! What would you like to do:\n" +
                                    "1. Balance statement\n" +
                                    "2. Make withdrawal\n" +
                                    "3. Make deposit\n" +
                                    "4. Log out");
                            menu = input.nextInt();
                            switch (menu) {
                                case 1: // show the lodged in customer balance
                                    System.out.println("Your Balance: " + currCustomer.getBalance());
                                    break;
                                case 2: // withdraw money from the lodged in user's balance
                                    System.out.print("How much would you like to withdraw: ");
                                    double with = input.nextDouble();
                                    work.withdraw(with, currCustomer);
                                    System.out.println("Your Balance: " + currCustomer.getBalance());
                                    break;
                                case 3: // deposit money in the lodged in user's balance
                                    System.out.print("How much would you like to deposit: ");
                                    double depo = input.nextDouble();
                                    work.deposit(depo, currCustomer);
                                    System.out.println("Your Balance: " + currCustomer.getBalance());
                                    break;
                                case 4:
                                    System.out.println("You've been logged out");
                                    break;
                            }
                        } while (menu != 4);
                    } else { // user not found (null)
                        System.out.println("Invalid information!");
                    }
                }
                break;
            case 2: // display the list of customer in the database
                System.out.println("Meet our happy customers!");
                data.printData();
                break;
            case 3: // exiting the ATM
                System.out.println("Exited the ATM");
                break;
            default:
                System.out.println("Enter a valid input");
                break;
        }
    }while(opt !=3);


    }
}
