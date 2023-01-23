import java.util.Scanner;

public class Game {

    private int[][] field;
    private int width;
    private int length;

    public Game(int[][] field, int width, int length) {
        this.field = field;
        this.width = width;
        this.length = length;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many shots do you want to take?");
        int numberOfShots = scan.nextInt();
        int countOfShips = 0;

        if (numberOfShots != 0) {
            System.out.println("Take your first shot");
        }

        while (numberOfShots > 0) {
            int first = scan.nextInt();
            int second = scan.nextInt();
            int shot = field[first][second];
            if (first < length && second < width && first >= 0 && second >= 0) {
                if (shot == 1) {
                    System.out.println("The target is destroyed");
                    countOfShips ++;
                } else if (shot == 2 || shot == 3 || shot == 4) {
                    System.out.println("The target is hit. A ship is damaged");
                    countOfShips ++;
                } else {
                    System.out.println("You missed");
                }
            } else {
                System.out.println("Shot out of the field");
            }
            numberOfShots --;

            if (numberOfShots != 0) {
                System.out.println("Shot left:" + numberOfShots);
                System.out.println("Take your next shot");
            } else {
                System.out.println();
                System.out.println("You have used up all your shots");
            }
        }

        System.out.println();
        System.out.println("You have " + countOfShips + " hits");
    }
}
