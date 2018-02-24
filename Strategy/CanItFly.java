package Patterns.Strategy;

public interface CanItFly {

    String Fly();

}

class ItCanFly implements CanItFly {

    public String Fly() {
        return "Flying high";
    }
}

class CantFly implements  CanItFly {

    public String Fly() {
        return "I can't fly";
    }
}