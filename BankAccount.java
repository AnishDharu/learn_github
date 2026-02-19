/*
Write an Java Program to implement a user defined exception "InSufficientFundException". Read amount from console and check whether entered amount is available in your account o r not. If amount i s available, then withdraw given amount and if it is not available then throw the exception "InSufficientF undException" and display how much amount is required to withdraw.
*/

import java.util.Scanner;
// User-defined exception
class InSufficientFundException extends Exception {
    double amountRequired;
    InSufficientFundException(double amountRequired) {
        this.amountRequired = amountRequired;
    }
    @Override
    public String getMessage() {
        return "Insufficient balance! Additional amount required: " + amountRequired;
    }
}

// Main class
public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000; // Available balance
        System.out.println("Available Balance: " + balance);
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();

        try {
            if (withdrawAmount > balance) {
                double required = withdrawAmount - balance;
                throw new InSufficientFundException(required);
            } else {
                balance = balance - withdrawAmount;
                System.out.println("Withdrawal Successful!");
                System.out.println("Remaining Balance: " + balance);
            }
        } catch (InSufficientFundException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
