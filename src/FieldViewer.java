import java.util.Arrays;

public class FieldViewer {

    private int length;

    public FieldViewer(int length) {
        this.length = length;
    }

    public void displayingField(int[][] field) {
        for (int i = 0; i < length; i++) {
            System.out.println(Arrays.toString(field[i]));
        }
    }
}
