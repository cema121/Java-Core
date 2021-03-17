package Lesson7;

class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood(int n) {
        food += n;
        System.out.println("Кто-то насыпал еще еды в миску +" + n + " , теперь в миске: " + food);
    }

    public void info() {
        System.out.println("В миске: " + food);
    }
}
