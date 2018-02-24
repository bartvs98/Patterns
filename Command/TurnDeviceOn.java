package Patterns.Command;

public class TurnDeviceOn implements Command{

    ElectronicDevice device;

    public TurnDeviceOn(ElectronicDevice device){

        this.device = device;

    }

    @Override
    public void execute() {

        device.on();

    }

    @Override
    public void undo() {

        device.off();

    }
}
