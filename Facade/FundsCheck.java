package Patterns.Facade;

public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount() { return cashInAccount; }

    public void withdraw(double cashWithdrawn){

        cashInAccount -= cashWithdrawn;

    }

    public void deposit(double cashDeposited){

        cashInAccount += cashDeposited;

    }

    public boolean haveEnoughMoney(double cashToWithdrawal){

        if (cashToWithdrawal > cashInAccount){

            System.out.println("Error: You don't have enough money.");
            System.out.println("Current balance: " + getCashInAccount());

            return false;

        } else {

            withdraw(cashToWithdrawal);
            System.out.println("Withdrawal complete: Current balance is: " + getCashInAccount());

            return true;

        }

    }

    public void makeDeposit(double cashToDeposit){

        deposit(cashToDeposit);
        System.out.println("Deposit complete: Current balance is: " + getCashInAccount());

    }

}
