 

**Title:** Java OOP ATM Client

**Description:**

This project implements a command-line ATM client application using Java and object-oriented programming (OOP) principles. It allows users to perform basic banking transactions such as viewing account balance, withdrawing and depositing funds.

**Features:**

* User login with ID and PIN verification (**To be implemented**)
* View account balance
* Withdraw cash (with insufficient balance check)
* Deposit cash
* Option to exit the ATM

**Technologies:**

* Java
* OOP concepts (Classes, Objects, Inheritance, Encapsulation)

**Installation:**

1. **Prerequisites:** Ensure you have Java installed on your system.
2. **Clone the repository:** Use Git to clone this repository:
   ```bash
   git clone https://github.com/HarithaMihimal/java-atm-client.git
   ```
   

**Running the Application:**

1. **Navigate to the project directory:**
   ```bash
   cd java-atm-client
   ```
2. **Compile the Java code:**
   ```bash
   javac AtmClient.java BankAccount.java Loan.java Transaction.java  # (or all .java files in the project)
   ```
   This creates a `.class` file for each Java class.
3. **Run the application:**
   ```bash
   java AtmClient
   ```

**Usage:**

1. The application will prompt you to enter your ID and PIN (**To be implemented**).
2. Upon successful login (**To be implemented**), you'll be presented with an ATM menu:
   * View Balance
   * Withdraw Money
   * Deposit Money
   * Exit
3. Select the desired option by entering the corresponding number (1-4) and pressing Enter.
4. Follow the on-screen prompts for specific actions like entering withdrawal/deposit amounts.

**Example:**

```
Welcome to ABC Bank!

Please enter your ID:
1234

Please enter your PIN:
****  # (PIN obscured for security)

Welcome, John Doe!

=====ABC Main Menu=====
1. View Balance
2. Withdraw Money
3. Deposit Money
4. Exit
Please select an option (1-4): 1

Account balance: $5000.00

=====ABC Main Menu=====
1. View Balance
2. Withdraw Money
3. Deposit Money
4. Exit
Please select an option (1-4): 2

Please enter the amount to withdraw: 100

Please wait...

Transaction successful!

Your new account balance is: $4900.00

=====ABC Main Menu=====
1. View Balance
2. Withdraw Money
3. Deposit Money
4. Exit
Please select an option (1-4): 3

Please enter the amount to deposit: 250

Please wait...

Transaction successful!

Your new account balance is: $5150.00

=====ABC Main Menu=====
1. View Balance
2. Withdraw Money
3. Deposit Money
4. Exit
Please select an option (1-4): 4

Thank you for using ABC Bank services!
```

**Further Development:**

* Implement user login with ID and PIN verification for secure access.
* Add features like transaction history, error handling for invalid inputs, and security measures to protect user data.
* Enhance the user interface with menus and prompts for better user experience.
* Consider storing account information in a persistent data store like a database for better scalability.

**License:**

This project is licensed under the MIT license.


