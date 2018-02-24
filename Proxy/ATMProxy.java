package Patterns.Proxy;

public class ATMProxy implements GetATMData {

    @Override
    public ATMState getATMData() {
        return new ATM().getATMData();
    }

    @Override
    public int getCashInMachine() {
        return new ATM().getCashInMachine();
    }

}
