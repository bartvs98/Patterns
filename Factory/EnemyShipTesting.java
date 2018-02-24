package Patterns.Factory;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args){

        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner userIntput = new Scanner(System.in);

        System.out.println("What type of ship? (U / R / B)");

        if (userIntput.hasNextLine()){

            String typeOfShip = userIntput.nextLine();

            theEnemy = shipFactory.makeEnemyShip(typeOfShip);

        }

        if (theEnemy != null) {

            doStuffEnemy(theEnemy);

        }

    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){

        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHereShip();
        anEnemyShip.enemyShipShoots();

    }

}
