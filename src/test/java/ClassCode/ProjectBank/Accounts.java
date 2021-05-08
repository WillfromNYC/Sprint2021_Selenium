package ClassCode.ProjectBank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Accounts {
    //public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int accountID = 0000;



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

            System.out.println("Your saving's account # is: " + customerAccountNum);

        } else if (accountType.contains("check")) {
            accountID++;
            customerAccountNum = accountID;
            cCheckingBalance = defaultBalance;
            System.out.println("Your saving's account # is: " + customerAccountNum);

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
        System.out.println("Which account would you like to withdraw funds from?");
        String withDrawRequest = input.next().toLowerCase().trim();

        System.out.println("How much funds would you like to withdraw?");
        int withDrawAmount = input.nextInt();

        if (withDrawRequest.contains("saving")) {
            if (cSavingsBalance-withDrawAmount > 0 && withDrawAmount > 0)
            cSavingsBalance = cSavingsBalance - withDrawAmount;

            System.out.println("Your saving's balance is: $" + cSavingsBalance);

        } else if (withDrawRequest.contains("check")) {
            if (cCheckingBalance-withDrawAmount > 0 && withDrawAmount > 0)
            cCheckingBalance = cCheckingBalance - withDrawAmount;
            System.out.println("Your checking account is: $" + cCheckingBalance);

        } else {
            System.out.println("We could not recognize your response, please type either savings or checking and the amount");
        }
    }



     /**      withDraw()
     *          input parameter: 2
     *              accountNum, amount
     *          output :
     */
     public void deposit(){
         System.out.println("Which account would you like to withdraw funds from?");
         String withDrawRequest = input.next().toLowerCase().trim();

         System.out.println("How much funds would you like to withdraw?");
         int depositAmount = input.nextInt();

         if (withDrawRequest.contains("saving") && depositAmount > 0) {
             cSavingsBalance = cSavingsBalance + depositAmount;

             System.out.println("Your saving's balance is: $" + cSavingsBalance);

         } else if (withDrawRequest.contains("check") && depositAmount > 0) {
             cCheckingBalance = cCheckingBalance + depositAmount;
             System.out.println("Your checking account is: $" + cCheckingBalance);

         } else {
             System.out.println("We could not recognize your response, please type either savings or checking and the amount");
         }
     }
     /**      deposit()
     *          input parameter: 2
     *              accountNum, amount
     *          output :
     */
     public void balance(){
         System.out.println("What is your account number?");
         int balanceRequest = input.nextInt();

         if (balanceRequest.contains("saving")) {
             System.out.println("Your saving's balance is: $" + cSavingsBalance);

         } else if (balanceRequest.contains("check")) {
             System.out.println("Your checking account is: $" + cCheckingBalance);

         } else {
             System.out.println("We could not recognize your response, please type either savings or checking");
         }
     }


     /**       balance()
     *          input parameter: 1
     *              accountNum
     *          output parameter: 1
     *              balance amount
     *
     */






}
