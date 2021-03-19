package Lesson8;

class Treadmill implements Obstacles{
    int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean toRun(int maxRun) {
        return (maxRun >= getDistance());
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }

    public String toString(){
        return ("беговую дорожку длинной " + getDistance() + "м.");
    }
}
