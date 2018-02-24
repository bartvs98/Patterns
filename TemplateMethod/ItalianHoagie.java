package Patterns.TemplateMethod;

public class ItalianHoagie extends Hoagie {

    String[] meatUsed = {"Salami", "Pepperoni", "Ham", "Chicken"};
    String[] cheeseUsed = {"Goudse", "Cheddar"};
    String[] veggiesUsed = {"Letuce", "Tomatoes", "Cucumber"};
    String[] condimentsUsed = {"Oil", "Vinegar", "Mayonnaise"};


    @Override
    void addMeat() {

        System.out.println("-----------------");
        System.out.println("Adding the Meat: ");

        for (String meat : meatUsed){

            System.out.println(meat + " ");

        }

    }

    @Override
    void addCheese() {

        System.out.println("-----------------");
        System.out.println("Adding the cheese: ");

        for (String cheese : cheeseUsed){

            System.out.println(cheese + " ");

        }

    }

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
