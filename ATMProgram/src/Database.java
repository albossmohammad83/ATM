public class Database {
    // array to hold our 10 customers
    private Customer[] data = new Customer[10];

    // default constructor to fill the array or the database with the 10 customers
    public Database() {
        Customer cus1 = new Customer("Joe","Jonson",45,
                "AeD87uLIK8",4321.99,"1E34");
        data[0] = cus1;
        Customer cus2 = new Customer("Jenna","Barton",23,
                "Uk3L85yMnP",458.22,"YMCA");
        data[1] = cus2;
        Customer cus3 = new Customer("Barry","Levine",67,
                "kYu2u3MpoN",875.21,"1B0R");
        data[2] = cus3;
        Customer cus4 = new Customer("Jenna","Porter",25,
                "N87TeH902N",168.26,"2TT7");
        data[3] = cus4;
        Customer cus5 = new Customer("Emily","Fisher",18,
                "myU25YlZn8",57.84,"9QQ7");
        data[4] = cus5;
        Customer cus6 = new Customer("Robert","Fisher",19,
                "802YuMpYn2",10.25,"B0Y0");
        data[5] = cus6;
        Customer cus7 = new Customer("Edward","Norton",48,
                "Rt824JkLyO",4321.99,"2365");
        data[6] = cus7;
        Customer cus8 = new Customer("Jose","Cuervo",38,
                "8Y74TrlK2Y",10003213.45,"2121");
        data[7] = cus8;
        Customer cus9 = new Customer("Barry","Whimby",22,
                "50EnmJ2Ky8",20312.65,"15Z7");
        data[8] = cus9;
        Customer cus10 = new Customer("Quincy","Adams",31,
                "182Rth2yLm",1532687.77,"1T84");
        data[9] = cus10;
    }

    // method to search for customer by first name
    public Customer searchFirstName(String firstName){
        for (int i = 0; i < data.length; i++){
            if(firstName.equals(data[i].firstName)) {
                return data[i];
            }
        }
        return null;
    }

    // method to search for customer by last name
    public Customer searchLastName(String lastName){
        for (int i = 0; i < data.length; i++){
            if(lastName.equals(data[i].lastName)) {
                return data[i];
            }
        }
        return null;
    }

    // method to search for customer by full name
    public Customer searchFullName(String firstName,String lastName){
        for (int i = 0; i < data.length; i++){
            if(firstName.equals(data[i].firstName) &&
                    lastName.equals(data[i].lastName)) {
                return data[i];
            }
        }
        return null;
    }

    // method to search for customer by account ID
    public Customer searchAccountID(String id){
        for (int i = 0; i < data.length; i++){
            if(id.equals(data[i].getId())) {
                return data[i];
            }
        }
        return null;
    }

    // method to search for customer by account PIN
    public Customer searchAccountPIN(String pin){
        for (int i = 0; i < data.length; i++){
            if(pin.equals(data[i].getPin())) {
                return data[i];
            }
        }
        return null;
    }

    // method to print and display the 10 customers 3 at a line
    public void printData(){
        for(int i = 0; i < data.length; i++){
                System.out.print(data[i].firstName + " " + data[i].lastName + " ");
            if(i % 3 == 2) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
