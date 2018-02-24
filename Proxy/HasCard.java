package Patterns.Proxy;

public class HasCard implements ATMState{

    ATM atm;

    public HasCard(ATM atm){

        this.atm = atm;

    }

    @Override
    public void insertCard() {

        System.out.println("Card already inserted.");

    }

    @Override
    public void ejectCard() {

        System.out.println("Card ejected.");
        atm.setAtmState(atm.getNoCard());

    }

    @Override
    public void insertPin(int pinEntered) {

        if (pinEntered == 1234){

            System.out.println("Correct PIN.");
            atm.correctPinEntered = true;
            atm.setAtmState(atm.getHasCorrecPin());

        } else {

            System.out.println("Wrong PIN.");
            atm.correctPinEntered = false;
            System.out.println("Card ejected.");
            atm.setAtmState(atm.getNoCard());

        }

    }

    @Override
    public void requestCash(int cashToWithdraw) {

        System.out.println("Enter PIN first.");

    }
}
