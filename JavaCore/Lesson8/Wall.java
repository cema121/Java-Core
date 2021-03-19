package Lesson8;

class Wall implements Obstacles {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean toRun(int maxLength) {
        return false;
    }

    @Override
    public boolean toJump(int maxJump) {
        return (maxJump >= getHeight());
    }

    public String toString() {
        return ("стену высотой " + getHeight() + "м.");
    }
}