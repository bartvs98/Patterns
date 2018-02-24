package Patterns.Proxy;

public class NoCard implements ATMState{

    ATM atm;

    public NoCard(ATM atm){

        this.atm = atm;

    }

    @Override
    public void insertCard() {

        System.out.println("Enter PIN.");
        atm.setAtmState(atm.getHasCard());

    }

    @Override
    public void ejectCard() {

        System.out.println("No card to eject.");

    }

    @Override
    public void insertPin(int pinEntered) {

        System.out.println("Enter a card first.");

    }

    @Override
    public void requestCash(int cashToWithdraw) {

        System.out.println("Insert card first.");

    }
}
