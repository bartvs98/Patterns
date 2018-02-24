package Patterns.State;

public class NoCash implements ATMState{

    ATM atm;

    public NoCash(ATM atm){

        this.atm = atm;

    }

    @Override
    public void insertCard() {

        System.out.println("ATM out of money.");

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

        System.out.println("ATM out of money.");

    }

}
