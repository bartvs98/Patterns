package Patterns.Builder;

public class TestRobotBuilder {

    public static void main(String[] args){

        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println(firstRobot.getHead());
        System.out.println(firstRobot.getTorso());
        System.out.println(firstRobot.getArms());
        System.out.println(firstRobot.getLegs());

    }

}
