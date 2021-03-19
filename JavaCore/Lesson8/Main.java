package Lesson8;

public class Main {
    public static void main(String[] args) {
        Participants[] participants_array = new Participants[3];
        participants_array[0] = new Cat("Барсик", 200, 3);
        participants_array[1] = new Human("Василий", 5, 1);
        participants_array[2] = new Robot("R2D2", 1000, 0);

        Obstacles[] obstacles_array = new Obstacles[2];
        obstacles_array[0] = new Treadmill(150);
        obstacles_array[1] = new Wall(1);

        System.out.println("Соревнования начинаются!");
        for (Participants participant : participants_array) {
            boolean finished = true;
            for (Obstacles obstacle : obstacles_array) {
                System.out.print(participant + " проходит " + obstacle);
                if (obstacle.toJump(participant.getMaxJump()) ||
                        obstacle.toRun(participant.getMaxRun())) {
                    System.out.println(" -> Прошел!");
                } else {
                    System.out.println(" -> Не смог.");
                    finished = false;
                    break;
                }
            }
            if (finished) {
                System.out.println(participant + " финишировал!\n");
            } else {
                System.out.println(participant + " сошел с дистанции.\n");
            }
        }
    }
}
