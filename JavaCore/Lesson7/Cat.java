package Lesson7;

class Cat {
    String name;
    int appetite;
    boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if ((plate.food - appetite) >= 0) {
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " скушал " + appetite + " и теперь он сытый: " + satiety + ", в миске осталось " + plate.food);
        } else {
            System.out.println(name + " хотел съесть " + appetite + " но не хватило еды и теперь он сытый: " + satiety + ", в миске осталось " + plate.food);
        }
    }
}
