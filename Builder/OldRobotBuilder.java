package Patterns.Builder;

public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder(){

        this.robot = new Robot();

    }

    @Override
    public void buildHead() {

        robot.setRoboHead("Tin Head");

    }

    @Override
    public void buildTorso() {

        robot.setRoboTorso("Tin Torso");

    }

    @Override
    public void buildArms() {

        robot.setRoboArms("Blowtorch arms");

    }

    @Override
    public void buildLegs() {

        robot.setRoboLegs("Rollerskates");

    }

    public Robot getRobot(){

        return this.robot;

    }

}
