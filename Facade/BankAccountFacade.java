package Patterns.Facade;

public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumCheck acctChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundChecker;

    WelcomeToBank bankWelcome;

    public BankAccountFacade(int accountNumber, int securityCode){

        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        bankWelcome = new WelcomeToBank();
        acctChecker = new AccountNumCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundsCheck();

    }

    public int getAccountNumber() { return accountNumber; }
    public int getSecurityCode() { return securityCode; }

    public void withdraw(double cashToWitdraw){

        if(acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode()) &&
                fundChecker.haveEnoughMoney(cashToWitdraw)){

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }

    public void deposit(double cashToDeposit){

        if(acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode())){

            fundChecker.makeDeposit(cashToDeposit);

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }
}
