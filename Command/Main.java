package Patterns.Command;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        ElectronicDevice TV = TVRemote.getTV();

        TurnDeviceOn onCommand = new TurnDeviceOn(TV);

        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();

        //--------------------

        TurnDeviceUp volUpCommand = new TurnDeviceUp(TV);

        onPressed = new DeviceButton(volUpCommand);

        onPressed.press();
        onPressed.press();
        onPressed.press();

        //--------------------

        TurnDeviceDown volDownCommand = new TurnDeviceDown(TV);

        onPressed = new DeviceButton(volDownCommand);

        onPressed.press();
        onPressed.press();
        onPressed.press();
        onPressed.press();

        //--------------------

        System.out.println("-------------------------------");

        ElectronicDevice radio = RadioRemote.getRadio();

        onCommand = new TurnDeviceOn(radio);

        onPressed = new DeviceButton(onCommand);

        onPressed.press();

        //--------------------

        System.out.println("-------------------------------");

        List<ElectronicDevice> devices = new ArrayList<>();

        devices.add(TV);
        devices.add(radio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(devices);

        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);

        turnThemOff.press();

    }

}
