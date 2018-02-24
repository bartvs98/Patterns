package Patterns.Command;

public class TVRemote {

    public static ElectronicDevice getTV(){

        return new Television();

    }

}
