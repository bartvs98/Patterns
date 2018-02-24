package Patterns.Command;

public class Television implements ElectronicDevice {

    private int volume = 0;

    @Override
    public void on() {

        System.out.println("TV is ON");

    }

    @Override
    public void off() {

        System.out.println("TV is OFF");

    }

    @Override
    public void volumeUp() {

        volume++;
        System.out.println("TV Volume is at " + volume);

    }

    @Override
    public void volumeDown() {

        if (volume > 0){

            volume--;
            System.out.println("TV Volume is at " + volume);

        } else {

            System.out.println("TV Volume is already at " + volume);

        }

    }
}
