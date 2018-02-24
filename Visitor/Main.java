package Patterns.Visitor;

public class Main {

    public static void main(String[] args){

        TaxVisitor taxVisitor = new TaxVisitor();

        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tobacco cigars = new Tobacco(19.99);

        System.out.println(milk.accept(taxVisitor) + "\n");
        System.out.println(vodka.accept(taxVisitor) + "\n");
        System.out.println(cigars.accept(taxVisitor) + "\n");

    }

}
