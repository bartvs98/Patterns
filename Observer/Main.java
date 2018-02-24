package Patterns.Observer;

public class Main {

    public static void main(String[] args){

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(1);
        stockGrabber.setAaplPrice(2);
        stockGrabber.setGoogPrice(3);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(4);
        stockGrabber.setAaplPrice(5);
        stockGrabber.setGoogPrice(6);

        stockGrabber.unregister(observer1);

        stockGrabber.setIbmPrice(7);
        stockGrabber.setAaplPrice(8);
        stockGrabber.setGoogPrice(9);

    }

}
