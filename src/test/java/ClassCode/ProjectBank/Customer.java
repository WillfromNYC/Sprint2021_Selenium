package ClassCode.ProjectBank;

import java.util.HashMap;
import java.util.Scanner;

public class Customer extends Accounts {

    /**
     * Customer ->
     *      Name
     *      SSN
     *      Address
     **/
    String fullName = "";
    int SSN;
    String Address = "";
    //static int savingAccount = 0000;
    //int checkingAccount = 0000;
    int customerTotal = 0;
    int customerID = 0;
    

    Scanner input = new Scanner(System.in);
    Accounts accountMethods = new Accounts();


    public Customer(String fullName, int SSN, String Address) {
        customerTotal++;
        customerID = customerTotal;
        System.out.println("Customer information successfully stored thank you");


    }

    public void editDetails() {
        System.out.println("Would you like to edit your fullName, SSN or Address?");
        String customerInput = input.next().toLowerCase().trim();

        if (customerInput.contains("name")) {
            System.out.println("Please enter your the new name");
            String customerInputName = input.next();
            fullName = customerInputName;
            System.out.println("Your new name is: " + fullName);
        } else if (customerInput.contains("ssn")) {
            System.out.println("Please enter your the new SSN");
            int customerInputSSN = input.nextInt();
            SSN = customerInputSSN;
            System.out.println("Your SSN is: " + SSN);
        } else if (customerInput.contains("Address")) {
            System.out.println("Please enter your the new name");
            String customerInputAddress = input.next();
            Address = customerInputAddress;
            System.out.println("Your new address is: " + Address);
        } else {
            System.out.println("We could not understand your request, please let us know if you want to change your fullName, SSN or Address");
        }
    }

    /**     methods
     *          editDetails()
     *              input parameter : none
     *              output : show the updated info.
     *              make it interactive, ask user for the field wanna edit, and new value **/

    public void createAccount() {
        System.out.println("Would you like to create a savings or checking account?");
        String AccountRequest = input.next().toLowerCase().trim();
        createAccount(AccountRequest);

    }

    /**          createAccount()
     *              input parameter : none
     *              if input is savings, create a savings account
     *              if input is checking, create a checking account
     *              if input is something else, show error
     *              make it interactive, ask user for account type
     *              show:
     *                  Savings account has been created.
     *                  Last 4-digits of account number is XXXX                 **/

    public void showAccountBalance(){
        balance();

    }

    /**          showAccountBalance()
     *              input parameter : none
     *              make it interactive, ask user for account number
     *              show:
     *                  Account number:
     *                  Balance:                            **/

    /**          showAllAccountBalance()
     *              show:
     *                  You have total X account.
     *                  Account number:
     *                  Balance:
     *
     *                  Account number:
     *                  Balance:
     *
     *                  Account number:
     *                  Balance:                             **/
    public void makeWithdraw() {
        withDraw();
    }
    /**          makeWithdraw:
     *              make it interactive, ask user for account number
     *              if valid account number, then ask for amount
     *              if amount is valid, make withdraw happen
     *              show:
     *                  Please collect $XXXX.YY amount
     *                  Your updated balance: $NNNN.MM              **/
    public void makeDeposit() {
        deposit();
    }


    /**          makeDeposit:
     *              make it interactive, ask user for account number
     *              if valid account number, then ask to enter the amount
     *              if amount is valid, make deposit happen
     *              show:
     *                  Amount has been deposited successfully
     *                  Your updated balance: $NNNN.MM
     *                  **/
}
