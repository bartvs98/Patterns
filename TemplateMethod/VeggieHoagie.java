package Patterns.TemplateMethod;

public class VeggieHoagie extends Hoagie {

    String[] veggiesUsed = {"Letuce", "Tomatoes", "Cucumber"};
    String[] condimentsUsed = {"Oil", "Vinegar", "Mayonnaise"};

    boolean customerWantsMeat() { return false; }
    boolean customerWantsCheese() { return false; }

    @Override
    void addMeat() {}

    @Override
    void addCheese() {}

    @Override
    void addVegetables() {

        System.out.println("-----------------");
        System.out.println("Adding the vegetables: ");

        for (String veggies : veggiesUsed){

            System.out.println(veggies + " ");

        }

    }

    @Override
    void addCondiments() {

        System.out.println("-----------------");
        System.out.println("Adding the condiments: ");

        for (String condiment : condimentsUsed){

            System.out.println(condiment + " ");

        }

    }

}
