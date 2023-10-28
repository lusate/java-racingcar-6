package racingcar.model;

public class Car {
    private static final int MOVING_DISTANCE = 1;
    private static final int STANDARD_MOVING = 4;

    private final Name name;
    private final Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }


    public void goOrStop(int number) {
        if (number >= STANDARD_MOVING) {
            position.carMove(MOVING_DISTANCE);
        }
    }

    public String getName() {
        return this.name.toString();
    }

    public int getPosition() {
        return this.position.toInt();
    }
}
