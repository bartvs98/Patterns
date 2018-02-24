package Patterns.Singleton;

public class Singleton {

    private static Singleton firstIncstance = null;


    private Singleton(){ }

    public static Singleton getInstance(){

        if (firstIncstance == null){

            firstIncstance = new Singleton();

        }

        return firstIncstance;

    }

}
