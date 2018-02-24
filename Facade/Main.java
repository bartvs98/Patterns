package Patterns.Facade;

public class Main {

    public static void main(String[] args){

        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

        accessingBank.withdraw(50.00);
        accessingBank.withdraw(900.00);
        accessingBank.deposit(200.00);

    }

}
