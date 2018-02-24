package Patterns.Strategy;

public class Main {

    public static void main(String[] args){

        Animal Bob = new Dog();
        Animal Maveric = new Bird();

        System.out.println("Bob: " + Bob.tryToFly());
        System.out.println("Maveric: " + Maveric.tryToFly());

        Bob.setFlyingAbility(new ItCanFly());

        System.out.println("Bob: " + Bob.tryToFly());

    }

}
