package Patterns.Proxy;

public class ATM implements GetATMData{

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrecPin;
    ATMState atmOutOfMoney;

    ATMState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATM(){

        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrecPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if (cashInMachine < 0){

            atmState = atmOutOfMoney;

        }
    }

    public void setAtmState(ATMState atmState){
        this.atmState = atmState;
    }

    public void setCashInMachine(int cashInMachine){
        this.cashInMachine = cashInMachine;
    }

    public void insertCard(){
        atmState.insertCard();
    }

    public void ejectCard(){
        atmState.ejectCard();
    }

    public void requestCash(int cashToWithdraw){
        atmState.requestCash(cashToWithdraw);
    }

    public void insertPin(int pinEntered){
        atmState.insertPin(pinEntered);
    }

    public ATMState getHasCard() { return hasCard; }
    public ATMState getNoCard() { return noCard; }
    public ATMState getHasCorrecPin() { return hasCorrecPin; }
    public ATMState getAtmOutOfMoney() { return atmOutOfMoney; }

    @Override
    public ATMState getATMData() {
        return atmState;
    }

    @Override
    public int getCashInMachine() {
        return cashInMachine;
    }
}
