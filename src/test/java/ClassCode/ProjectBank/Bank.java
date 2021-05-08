package ClassCode.ProjectBank;

public class Bank {
    public static void main(String[] args) {
        //Customer customerAccount = new Customer();

        //customerAccount.editDetails();

        Customer c1 = new Customer("Jan", 12345678, "1 bank st");
        Customer c2 = new Customer("Fabbio", 12345679, "2 bank st");
        Customer c3 = new Customer("Mary", 22345678, "3 bank st");
        Customer c4 = new Customer("April", 42345678, "4 bank st");


    }


    /**
     *
     * Class -> Bank, Customer, Accounts
     *
     * One customer can have any number of account
     * Each customer will have unique customerId
     * Each account will have unique account number
     *
     *
     * Bank ->
     *      main method
     *      In this class, we will never create object of Accounts class.
     *      In this class, we will never use methods/variables of Accounts class.
     *      In this class, we will be using Customer class.
     *      In this class, creating one customer object means creating a customer
     *
     *      To create Customer,
     *          customer has to enter 3 data
     *             1. Name
     *             2. SSN
     *             3. Type of account they want to open (Savings, Checking)
     *
     *          customer can enter 4 data
     *             1. Name
     *             2. SSN
     *             3. Address
     *             4. Type of account they want to open (Savings, Checking)
     *
     *      When creating object of Customer class,
     *          if all data is given this should create an account as well.
     *
     *             Customer c1 = new Customer("name", 1234, "Savings");
     *                  show:
     *                      Congratulations for your new account.
     *                      Account number: 0909
     *
     *             c1.showAllAccountBalance();
     *                  show:
     *                      You have total 1 account.
     *                      Account number:
     *                      Balance:
     *
     */
}
