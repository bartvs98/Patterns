package Patterns.Command;

public class TurnDeviceOff implements Command {

    ElectronicDevice device;

    public TurnDeviceOff(ElectronicDevice device){

        this.device = device;

    }

    @Override
    public void execute() {

        device.off();

    }

    @Override
    public void undo() {

        device.on();

    }

}
