package Patterns.Command;

public class TurnDeviceDown implements Command {

    ElectronicDevice device;

    public TurnDeviceDown(ElectronicDevice device){

        this.device = device;

    }

    @Override
    public void execute() {

        device.volumeDown();

    }

    @Override
    public void undo() {

        device.volumeUp();

    }
}
