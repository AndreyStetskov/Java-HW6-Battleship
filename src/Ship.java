import java.util.Random;

public enum Ship {

    ONE_DECKER (1),
    TWO_DECKER_HORIZONTAL(2),
    TWO_DECKER_VERT(2),
    THREE_DECKER_HORIZONTAL(3),
    THREE_DECKER_VERT(3),
    FOUR_DECKER_HORIZONTAL(4),
    FOUR_DECKER_VERT(4);

    private int desk;

    Ship(int desk) {
        this.desk = desk;
    }

    public static Ship generateRandomTwoDeckerS() {
        Random random = new Random();

        Ship[] values = Ship.values();
        int length = values.length;
        int randomIndex = random.nextInt(1, 3);
        return values[randomIndex];
    }

    public static Ship generateRandomThreeDeckerS() {
        Random random = new Random();

        Ship[] values = Ship.values();
        int length = values.length;
        int randomIndex = random.nextInt(3, 5);
        return values[randomIndex];
    }

    public static Ship generateRandomFourDeckerS() {
        Random random = new Random();

        Ship[] values = Ship.values();
        int length = values.length;
        int randomIndex = random.nextInt(5, 7);
        return values[randomIndex];
    }

    public int getDesk() {
        return desk;
    }
}
