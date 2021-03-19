package Lesson8;

public class Robot implements Participants{
    String name;
    int maxRun;
    int maxJump;

    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    public String toString(){
        return name;
    }

}
