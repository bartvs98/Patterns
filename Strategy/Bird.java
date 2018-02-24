package Patterns.Strategy;

public class Bird extends Animal {

    public Bird(){
        super();

        flyingType = new ItCanFly();

    }

}
