package Patterns.State;

public class Main {

    public static void main(String[] args){

        ATM atm = new ATM();

        atm.insertCard();
        atm.ejectCard();
        atm.insertCard();
        atm.insertPin(1234);
        atm.requestCash(2000);
        atm.insertCard();
        atm.insertPin(1234);
    }

}
