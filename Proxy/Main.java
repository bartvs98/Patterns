package Patterns.Proxy;

public class Main {

    public static void main(String[] args){

        GetATMData getATMData = new ATM();
        GetATMData atmProxy = new ATMProxy();

        System.out.println("ATM State: " + atmProxy.getATMData());
        System.out.println("ATM Cash: " + atmProxy.getCashInMachine());

    }

}
