import java.util.ArrayList;
import java.util.Scanner;
// Client class represents the clients of ABC Bank 
class AtmClient {
    private int id;
    private  String pin;
    private String name;
    private String gender;
    private String address;
    private String occupation;
    private String nationality;
    private int age;
    public BankAccount[] accounts;//{"saving accounts", "current accounts", "loans"}; // an array of bank
    // Constructor for Client class
    public AtmClient(int id, String name, String nationality, String occupation, String address, int age, String gender,
                     String pin, BankAccount accounts) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.occupation = occupation;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.pin = pin;
        this.accounts = new BankAccount[]{accounts};
    }
    // Method to get the PIN of the client
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getNationality() {
        return nationality;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getPin() {
        return pin;
    }

    public void setAccounts(BankAccount[] accounts) {
        this.accounts = accounts;
    }

    // Method to get the bank accounts of the client 
    public BankAccount[] getAccounts() {
        return accounts;
    }

    public static void main(String[] args) {

        // Initialize client information 
        int id ;
        String name ;
        String nationality ;
        String occupation ;
        String address ;
        int age;
        String gender ;
        String pin ;


        // Create bank accounts for the client 

        BankAccount account1 = new BankAccount(667788995, "USD", "Katubedda01", 1000.00);
        BankAccount account2 = new BankAccount(223344556, "LKR", "Katubedda", 5000.00);
        // Associate the bank accounts with the client 
        BankAccount[] accounts = {account1, account2};
        //create some  objects using Client class 
        AtmClient client1=new AtmClient(1,"client01","Srilankan","Student","UoM",21,"Male","1234",account1);
        AtmClient client2=new AtmClient(1,"client01","Srilankan","Student","UoM",22,"Male","1122",account2);
        //create client list 
        ArrayList<String> clientList=new ArrayList<String>();
        clientList.add("client1");
        clientList.add("client2");

        // ask for pin  and give Welcome to the client 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        String inputPin = scanner.nextLine();

        // confermetion for the pin 

        while (!inputPin.equals(client1.getPin())) {
            System.out.print("Invalid PIN.");
            inputPin = scanner.nextLine();
        }


        // Client Menu 
        boolean exit = false;
        while (!exit) {
            System.out.print("\n=====ABC Main Menu=====\n");
            System.out.print("1. View Balance\n");
            System.out.print("2. Withdraw Money\n");
            System.out.print("3. Deposit Money\n");
            System.out.print("4. Exit\n");
            System.out.print("Please select an option (1-4): ");

            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1 -> System.out.println("Account balance: " + BankAccount.getBalance());
                case 2 -> {
                    System.out.print("Please enter the amount to withdraw: ");
                    double withdrawalAmount = Double.parseDouble(scanner.nextLine());
                    BankAccount.withdraw(withdrawalAmount);
                }
                case 3 -> {
                    System.out.print("Please enter the amount to deposit: ");
                    double depositAmount = Double.parseDouble(scanner.nextLine());
                    BankAccount.deposit(depositAmount);
                }
                case 4 -> exit = true;
                default -> System.out.println("Please try again.Invalid option. ");
            }
        }

        System.out.println("Thank you for using ABC Bank services!.Bye");

    }

}



// BankAccount class represents the bank accounts of the clients 
class BankAccount {
    //create privete variable 
    private int accountNumber;
    private String currency;
    private String branch;
    private static double balance;

    // Constructor for BankAccount class 
    public BankAccount(int accountNumber, String currency, String branch, double balance) {
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.branch = branch;
        BankAccount.balance = balance;
    }public BankAccount() { }


    // get the balance 
    public static double getBalance() {
        return balance;
    }
    // get the branch 
    public String getBranch() {
        return branch;
    }

    // get the currency 
    public String getCurrency() {
        return currency;
    }
    //get the account number 
    public int getAccountNumber() {
        return accountNumber;
    }

    //  deposit the money into the account 
    public static void deposit(double amount) {
        balance =balance+ amount;
    }

    // withdraw the money from the account 
    public static void withdraw(double amount) {
        if (balance >= amount) {
            balance =balance- amount;
        } else {
            System.out.println("Insufficient account balance");
        }
    }
}

// Loan class 
//denoted by the loans of the clients 
class Loan extends BankAccount{
    private String paymentMethod;
    private double amount,interest;
    private BankAccount account; // the account linked to the loan 
    private int duration;

    // Constructor for Loan class 
    public Loan(double amount, double interest, int duration, String paymentMethod, BankAccount account) {
        this.amount = amount;
        this.interest = interest;
        this.duration = duration;
        this.paymentMethod = paymentMethod;
        this.account = account;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }
    public BankAccount getAccount() {
        return account;
    }
    public void setAccount(BankAccount account) {
        this.account = account;
    }
    public double getInterest() {
        return interest;
    }
    public void setInterest(double interest) {
        this.interest = interest;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public void LoneAcsept(int amount){
        deposit(amount);
        System.out.println(" succesfully got the lone ");
    }
}
//Transaction class represents the transactions made by the clients 
class Transaction extends BankAccount{
    private  int id;
    private int bankAccountId; // the id of the bank account used for the transaction
    private String date,status;
    private double amount; // the transaction amount or balance
    //method to  set ammount
    public void setAmount(double amount) {
        this.amount = amount;
    }
    //method to get ammount
    public double getAmount() {
        return amount;
    }
    //creating transaction methods
    public void TransactionWithdrow(double amount){
        withdraw(amount);
        System.out.println("Transaction withdrow successful");
    }
    public void TransactionDiposit(double amount) {
        deposit(amount);
        System.out.println("Transaction diposit successful");
    }
}
