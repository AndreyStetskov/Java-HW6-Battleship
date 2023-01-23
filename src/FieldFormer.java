import java.util.Random;

public class FieldFormer {


    private int width;
    private int length;

    public FieldFormer(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int[][] generate() {
        Random random = new Random();
        int[][] field = new int[width][length];
        int ships = 0, doubleShips = 0, tripleShips = 0, fourthShips = 0;

        while (fourthShips < 2) {
            switch (Ship.generateRandomFourDeckerS()){
                case FOUR_DECKER_VERT:
                    int a = random.nextInt(0, length - Ship.FOUR_DECKER_VERT.getDesk());
                    int b = random.nextInt(0, width);
//                    if (IsPossibility.vertical(field, a, b, Ship.FOUR_DECKER_VERT.getDesk())) {
//                        continue;
//                    }
                    if (field[a][b] == 0 && field[a + 1][b] == 0 && field[a + 2][b] == 0 && field[a + 3][b] == 0) {
                        for (int i = 0; i < Ship.FOUR_DECKER_VERT.getDesk(); i++) {
                            field[a + i][b] = 4;
                        }
                        fourthShips++;
                    }
                    break;
                case FOUR_DECKER_HORIZONTAL:
                    int aa = random.nextInt(0, length);
                    int bb = random.nextInt(0, width - Ship.FOUR_DECKER_HORIZONTAL.getDesk());
//                    if (IsPossibility.horizontal(field, a, b, Ship.FOUR_DECKER_HORIZONTAL.getDesk())) {
//                        continue;
//                    }
                    if (field[aa][bb] == 0 && field[aa][bb + 1] == 0 && field[aa][bb + 2] == 0 && field[aa][bb + 3] == 0) {
                        for (int i = 0; i < Ship.FOUR_DECKER_HORIZONTAL.getDesk(); i++) {
                            field[aa][bb + i] = 4;
                        }
                        fourthShips++;
                    }
            }
        }

        while (tripleShips < 4) {
            switch (Ship.generateRandomThreeDeckerS()){
                case THREE_DECKER_VERT:
                    int a = random.nextInt(0, length - Ship.THREE_DECKER_VERT.getDesk());
                    int b = random.nextInt(0, width);
                    if (field[a][b] == 0 && field[a + 1][b] == 0 && field[a + 2][b] == 0) {
                        for (int i = 0; i < Ship.THREE_DECKER_VERT.getDesk(); i++) {
                            field[a + i][b] = 3;
                        }
                        tripleShips++;
                    }
                    break;
                case THREE_DECKER_HORIZONTAL:
                    int aa = random.nextInt(0, length);
                    int bb = random.nextInt(0, width - Ship.THREE_DECKER_HORIZONTAL.getDesk());
                    if (field[aa][bb] == 0 && field[aa][bb + 1] == 0 && field[aa][bb + 2] == 0) {
                        for (int i = 0; i < Ship.THREE_DECKER_HORIZONTAL.getDesk(); i++) {
                            field[aa][bb + i] = 3;
                        }
                        tripleShips++;
                    }
            }
        }

        while (doubleShips < 6) {
            switch (Ship.generateRandomTwoDeckerS()){
                case TWO_DECKER_VERT:
                    int a = random.nextInt(0, length - Ship.TWO_DECKER_VERT.getDesk());
                    int b = random.nextInt(0, width);
                    if (field[a][b] == 0 && field[a + 1][b] == 0) {
                        for (int i = 0; i < Ship.TWO_DECKER_VERT.getDesk(); i++) {
                            field[a + i][b] = 2;
                        }
                        doubleShips++;
                    }
                    break;
                case TWO_DECKER_HORIZONTAL:
                    int aa = random.nextInt(0, length);
                    int bb = random.nextInt(0, width - Ship.TWO_DECKER_HORIZONTAL.getDesk());
                    if (field[aa][bb] == 0 && field[aa][bb + 1] == 0) {
                        for (int i = 0; i < Ship.TWO_DECKER_HORIZONTAL.getDesk(); i++) {
                            field[aa][bb + i] = 2;
                        }
                        doubleShips++;
                    }
            }
        }

        while (ships < 8) {
            int a = random.nextInt(0, length);
            int b = random.nextInt(0, width);

            if (field[a][b] == 0) {
                field[a][b] = 1;
                ships++;
            }
        }

        return field;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
