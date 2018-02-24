package Patterns.TemplateMethod;

public class Main {

    public static void main(String[] args){

        Hoagie cust1Hoagie = new ItalianHoagie();

        cust1Hoagie.makeSandwich();

        System.out.println("\n");

        Hoagie cust2Hoagie = new VeggieHoagie();

        cust2Hoagie.makeSandwich();

    }

}
