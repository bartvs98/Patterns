package Patterns.Command;

public class Radio implements ElectronicDevice {

    private int volume = 0;

    @Override
    public void on() {

        System.out.println("Radio is ON");

    }

    @Override
    public void off() {

        System.out.println("Radio is OFF");

    }

    @Override
    public void volumeUp() {

        volume++;
        System.out.println("Radio Volume is at " + volume);

    }

    @Override
    public void volumeDown() {

        if (volume > 0){

            volume--;
            System.out.println("Radio Volume is at " + volume);

        } else {

            System.out.println("Radio Volume is already at" + volume);

        }

    }

}
