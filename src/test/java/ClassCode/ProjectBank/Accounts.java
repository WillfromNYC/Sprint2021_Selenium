package ClassCode.ProjectBank;

import  java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Accounts {//public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int accountID = 0000;
    HashMap<Integer,Double> idBalance = new HashMap<>();



    int customerAccountNum;

    double defaultBalance = 0;

    DecimalFormat df = new DecimalFormat("$###,###,###.##");
    static double cSavingsBalance = 0;
    static double cCheckingBalance = 0;



    //}

    public void createAccount(String AccountRequest) {
        System.out.println("Which account are you opening with us today?");
        String accountType = input.next().toLowerCase().trim();
        if (accountType.contains("saving")) {
            accountID++;
            customerAccountNum = accountID;
            cSavingsBalance = defaultBalance;
            idBalance.put(customerAccountNum,cSavingsBalance);

            System.out.println("Savings account has been created. Last 4-digits of account number is " + customerAccountNum);

        } else if (accountType.contains("check")) {
            accountID++;
            customerAccountNum = accountID;
            cCheckingBalance = defaultBalance;
            System.out.println("Checking account has been created. Last 4-digits of account number is "  + customerAccountNum);
            idBalance.put(customerAccountNum,cCheckingBalance);

        } else {
            System.out.println("We could not recognize your response, please type either savings or checking");
        }
    }

    /**
     *
     *
     * methods
     *      createAccount()
     *          input parameter : 1
     *          output parameter : 1 (4 digits of created account #)
     **/
    public void withDraw(){
        System.out.println("Which account number would you like to withdraw funds from?");
        int withDrawAccountNum = input.nextInt();

        System.out.println("How much funds would you like to withdraw?");
        int withDrawAmount = input.nextInt();

        if (idBalance.containsKey(withDrawAccountNum) && withDrawAmount > 0 && (idBalance.get(withDrawAccountNum) - withDrawAmount > 0 )) {
            double newBalance = idBalance.get(withDrawAccountNum);
            newBalance = newBalance - withDrawAmount;
            idBalance.remove(withDrawAccountNum);
            idBalance.put(withDrawAccountNum,newBalance);
            System.out.println("Please collect $" + withDrawAccountNum + "amount. Your updated balance: $" + newBalance);

        } else {
            System.out.println("We could not find your account number please try it again");
        }

    }



    /**      withDraw()
     *          input parameter: 2
     *              accountNum, amount
     *          output :
     */
    public void deposit(){
        System.out.println("Which account number would you like to withdraw funds from?");
        int depositAccountNum = input.nextInt();

        System.out.println("How much funds would you like to withdraw?");
        int depositAmount = input.nextInt();

        if (idBalance.containsKey(depositAccountNum) && depositAmount > 0) {
            double newBalance = idBalance.get(depositAccountNum);
            newBalance = newBalance + depositAmount;
            idBalance.remove(depositAccountNum);
            idBalance.put(depositAccountNum,newBalance);
            System.out.println("$" + depositAccountNum + "Amount has been deposited successfully. Your updated balance: $" + newBalance);

        } else {
            System.out.println("We could not find your account number please try it again");
        }
    }

    /**      deposit()
     *          input parameter: 2
     *              accountNum, amount
     *          output :
     */
    public void balance(){
        System.out.println("What is your account number?");
        int balanceAccountNum = input.nextInt();

        System.out.println("Your account number " + balanceAccountNum +" has a balance is currently of $" + idBalance.get(balanceAccountNum));


    }


    /**       balance()
     *          input parameter: 1
     *              accountNum
     *          output parameter: 1
     *              balance amount
     *
     */


}
