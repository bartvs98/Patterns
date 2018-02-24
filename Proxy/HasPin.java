package Patterns.Proxy;

public class HasPin implements ATMState{

    ATM atm;

    public HasPin(ATM atm){

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

        System.out.println("Already entered PIN.");

    }

    @Override
    public void requestCash(int cashToWithdraw) {

        if (cashToWithdraw > atm.cashInMachine){

            System.out.println("Not enough cash in machine");
            System.out.println("Ejecting card");
            atm.setAtmState(atm.getNoCard());

        } else {

            System.out.println(cashToWithdraw + " has been ejected");
            atm.setCashInMachine(atm.cashInMachine - cashToWithdraw);
            System.out.println("Ejecting card");
            atm.setAtmState(atm.getNoCard());

            if (atm.cashInMachine <= 0){

                atm.setAtmState(atm.getAtmOutOfMoney());

            }

        }

    }

}
