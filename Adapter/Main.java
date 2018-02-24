package Patterns.Adapter;

public class Main {

    public static void main(String[] args){

        EnemyAttacker tank = new EnemyTank();

        EnemyRobot robot = new EnemyRobot();

        EnemyAttacker adaptedRobot = new EnemyRobotAdapter(robot);

        robot.reactToHuman("Henk");
        robot.walkForward();
        robot.smashWithHands();

        System.out.println();

        tank.assignDriver("Frank");
        tank.driveForward();
        tank.fireWeapon();

        System.out.println();

        adaptedRobot.assignDriver("Mark");
        adaptedRobot.driveForward();
        adaptedRobot.fireWeapon();
    }

}
