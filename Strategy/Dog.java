package Patterns.Strategy;

public class Dog extends Animal {

    public Dog(){
        super();

        flyingType = new CantFly();

    }

}
