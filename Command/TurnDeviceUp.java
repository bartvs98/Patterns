package Patterns.Command;

public class TurnDeviceUp implements Command {

    ElectronicDevice device;

    public TurnDeviceUp(ElectronicDevice device){

        this.device = device;

    }

    @Override
    public void execute() {

        device.volumeUp();

    }

    @Override
    public void undo() {

        device.volumeDown();

    }

}
