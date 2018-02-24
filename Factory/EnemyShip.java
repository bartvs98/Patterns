package Patterns.Factory;

public abstract class EnemyShip {

    private String name;
    private double amtDamage;
    private double speed;

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public double getDamage(){ return amtDamage; }
    public void setDamage(double amtDamage){ this.amtDamage = amtDamage; }

    public double getSpeed(){ return speed; }
    public void setSpeed(double speed){ this.speed = speed; }

    public void followHereShip(){

        System.out.println(getName() + " is following the hero with " + getSpeed() + " km/h");

    }

    public void displayEnemyShip(){

        System.out.println(getName() + " is on the screen");

    }

    public void enemyShipShoots(){

        System.out.println(getName() + " attacks and does " + getDamage() + " damage");

    }

}
