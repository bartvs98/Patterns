package Patterns.Builder;

public class Robot implements RobotPlan {

    private String head;
    private String torso;
    private String arms;
    private String legs;

    @Override
    public void setRoboHead(String head) {

        this.head = head;

    }

    public String getHead() { return head; }

    @Override
    public void setRoboTorso(String torso) {

        this.torso = torso;

    }

    public String getTorso() { return torso; }

    @Override
    public void setRoboArms(String arms) {

        this.arms = arms;

    }

    public String getArms() { return arms; }

    @Override
    public void setRoboLegs(String legs) {

        this.legs = legs;

    }

    public String getLegs() { return legs; }
}
