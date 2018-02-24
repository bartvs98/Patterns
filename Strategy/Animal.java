package Patterns.Strategy;

// Superclass
public class Animal {

    public CanItFly flyingType;

    public String tryToFly(){

        return flyingType.Fly();

    }

    public void setFlyingAbility(CanItFly newFlyingType){

        flyingType = newFlyingType;

    }

}
